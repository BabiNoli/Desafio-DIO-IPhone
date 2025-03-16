package me.dio.novoIPhone.classes;

import java.util.Scanner;

public class AparelhoTelefonico extends IPhone {
	
	Scanner sc = new Scanner(System.in);
	
	public AparelhoTelefonico() {
		super();
	}
	
	
	@Override
	public boolean exibirMenu() {
		System.out.println("Menu do Reprodutor Musical: \n 0 - Desligar o Reprodutor Musical \n 1 - Fazer uma chamada \n 2 - Desligar a chamada \n 3 - Atender a uma chamada \n 4 - Deixar uma mensagem de correio de voz \n 5 - Menu Volume");
		super.menu = sc.nextInt();
		acaoMenu(menu);
		return super.menuanterior;
		
	}
		
	@Override
	public boolean acaoMenu(int menu) {
		
		if (super.menu == 0) {
			return menuanterior = true;

		} else if (super.menu == 1) {
			System.out.println("Digite o número do telefone: ");
			String numeroTel = sc.next().concat(sc.nextLine());
			ligar(numeroTel);
			return menuanterior = false;
			
		} else if (super.menu == 2) {
			desligar();
			return menuanterior = false;
		} else if (super.menu == 3) {
			atender();
			return menuanterior = false;
		} else if (super.menu == 4) {
			iniciarCorreioVoz();
			return menuanterior = false;
		} else if (super.menu == 5) {
			menuVolume();
			return menuanterior = false;
		} else {
			System.out.println("Opção inválida.");
			return menuanterior = true;
		}
		
	
	}

	private void ligar(String numero) {
		System.out.println("Ligando para " + numero + "...");
	}
	
	private void desligar() {
		System.out.println("Desligando chamada...");
	}
	
	private void atender() {
		System.out.println("Atendendo chamada...");
	}
	
	
	private void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado. Deixe sua mensagem após o sinal.");
		System.out.println("Bip...");
		System.out.println("Digite a sua mensagem: ");
		String mensagem = sc.next().concat(sc.nextLine());
		System.out.println("Mensagem gravada: " + mensagem);
		System.out.println("Fim da mensagem.");
	}

}
