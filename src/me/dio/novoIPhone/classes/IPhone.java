package me.dio.novoIPhone.classes;

import java.util.Scanner;

public abstract class IPhone {
	
	protected int menu;
	protected boolean menuanterior;
	protected int volume = 50;
	protected int menuVolume;

	Scanner sc = new Scanner(System.in);
	
	public abstract boolean exibirMenu();
	protected abstract boolean acaoMenu(int menu);
	
	protected void menuVolume() {
		
		do {
			System.out.println("Menu de Volume: \n 0 - Sair do Menu de Volume \n 1 - Aumentar Volume \n 2 - Diminuir Volume \n 3 - Mudo \n 4 - Ativar Volume");
			menuVolume = sc.nextInt();
		
		
			if (menuVolume == 0) {
				menuanterior = true;
			} else if (menuVolume == 1) {
				aumentarVolume();
				menuanterior = false;
			} else if (menuVolume == 2) {
				diminuirVolume();
				menuanterior = false;
			} else if (menuVolume == 3) {
				mutarVolume();
				menuanterior = false;
			} else if (menuVolume == 4) {
				desmutarVolume();
				menuanterior = false;
			} else {
				System.out.println("Opção inválida.");
				menuanterior = true;
			}
		
		} while (menuVolume != 0);
	}
	
	private void aumentarVolume() {
		if (volume < 100) {
			volume++;
			System.out.println("Volume: " + volume);
		}else {
			System.out.println("Volume: Máximo");
		}
	}
	
	private void diminuirVolume() {
		if (volume > 0) {
			volume--;
			System.out.println("Volume: " + volume);
		}else {
			System.out.println("Volume: Mínimo");
		}
	}
	
	private void mutarVolume() {
		System.out.println("Volume: Mudo");
		volume = 0;
	}
	
	private void desmutarVolume() {
		System.out.println("Volume: Ativo");
		volume = 50;
	}
	
}
