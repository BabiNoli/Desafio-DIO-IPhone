package me.dio.novoIPhone;

import java.util.Scanner;

import me.dio.novoIPhone.classes.AparelhoTelefonico;
import me.dio.novoIPhone.classes.NavegadorInternet;
import me.dio.novoIPhone.classes.ReprodutorMusical;


public class Main {

	public static void main(String[] args) {
		
		int funcao;
		boolean menuanterior = false;
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			do {
				System.out.println("O aparelho está livre para uso.\n Escolha uma função:\n 0 - Para sair \n 1 - Reprodutor Musical \n 2 - Navegador de Internet \n 3 - Aparelho Telefonico \n 4 - Volume");
				funcao = sc.nextInt();
				
				if (funcao == 0) {
					System.out.println("O aparelho foi desligado.");
					break;
				} else if (funcao == 1) {
					
					System.out.println("O iphone está em uso no modo Reprodutor Musical.");
					ReprodutorMusical reprodutor = new ReprodutorMusical();
					do {
						menuanterior = reprodutor.exibirMenu();
					} while (!menuanterior);
								
					
				} else if (funcao == 2) {
					System.out.println("O iphone está em uso no modo Navegador de Internet.");
					NavegadorInternet navegador = new NavegadorInternet();
					do {
						menuanterior = navegador.exibirMenu();
					} while (!menuanterior);
				} else if (funcao == 3) {
					System.out.println("O iphone está em uso no modo Aparelho Telefonico.");
					AparelhoTelefonico telefone = new AparelhoTelefonico();
					do {
						menuanterior = telefone.exibirMenu();
					} while (!menuanterior);
				
				} else {
					System.out.println("Função inválida.");
					
				}	
					
					
			} while (funcao != 1 && funcao != 2 && funcao != 3 || menuanterior);
				
				
		} catch (Exception e) {
			System.out.println("Erro ao escolher função.");
		}
		sc.close();
		
		
	}
}
