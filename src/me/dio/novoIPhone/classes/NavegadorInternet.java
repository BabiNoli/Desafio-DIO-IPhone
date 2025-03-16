package me.dio.novoIPhone.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NavegadorInternet extends IPhone {
	
	Scanner sc = new Scanner(System.in);
	
	
	private List<String> urlvisitadas = new ArrayList<>();
	
	public NavegadorInternet() {
		super();
	}
	
	@Override
	public boolean exibirMenu() {
		System.out.println("Menu do Navegador de Internet: \n 0 - Desligar o Navegador de Internet \n 1 - Exibir página \n 2 - Adicionar nova aba \n 3 - Fechar aba \n 4 - Histórico de navegação \n 5 - Limpar histórico \n 6 - Menu Volume");
		super.menu = sc.nextInt();
		acaoMenu(menu);
		return super.menuanterior;
		
	}
	
	@Override
	public boolean acaoMenu(int menu) {
		
		if (super.menu == 0) {
			return menuanterior = true;

		} else if (super.menu == 1) {
			System.out.println("Digite a URL da página: ");
			String url = sc.next().concat(sc.nextLine());
			exibirPagina(url);
			return menuanterior = false;
			
		} else if (super.menu == 2) {
			System.out.println("Digite a URL da página: ");
			String url = sc.next().concat(sc.nextLine());
			adicionarNovaAba(url);
			return menuanterior = false;
		} else if (super.menu == 3) {
			fecharAba();
			return menuanterior = false;
		} else if (super.menu == 4) {
			historico();
			return menuanterior = false;
		} else if (super.menu == 5) {
			limparHistorico();
			return menuanterior = false;
		} else if (super.menu == 6) {
			menuVolume();		
			return menuanterior = false;
		} else {
			System.out.println("Opção inválida.");
			return menuanterior = true;
		}
		
	
	}
	
	private void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
		urlvisitadas.add(url);
	}
	
	private void adicionarNovaAba(String url) {
		System.out.println("Nova aba adicionada: " + url);
		urlvisitadas.add(url);
	}
	
	private void fecharAba() {
		System.out.println("Aba fechada.");
	}
	
	private void historico() {
		System.out.println("Histórico de navegação.");
		
		if (urlvisitadas.isEmpty()) {
			System.out.println("Histórico vazio.");
		}else {
			for (String url : urlvisitadas) {
				System.out.println(url);
			}
		}
	}
	
	private void limparHistorico() {
		System.out.println("Histórico de navegação limpo.");
		urlvisitadas.clear();
	}

}
