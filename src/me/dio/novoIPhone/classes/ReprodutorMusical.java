package me.dio.novoIPhone.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReprodutorMusical extends IPhone {
	
	private List<String> musicas = new ArrayList<>();
	private int posicaoMusicaAtual;
	
	Scanner sc = new Scanner(System.in);
	
	
	public ReprodutorMusical() {
		super(); 
		
	}
	
		@Override
		public boolean exibirMenu() {
			System.out.println("Menu do Reprodutor Musical: \n 0 - Desligar o Reprodutor Musical \n 1 - Selecionar música \n 2 - Tocar música \n 3 - Pausar música \n 4 - Avançar música na playlist \n 5 - Voltar música na playlist \n 6 - Menu Volume");
			super.menu = sc.nextInt();
			acaoMenu(menu);
			return super.menuanterior;
			
		}
			
		@Override
		public boolean acaoMenu(int menu) {
			
			if (super.menu == 0) {
				return menuanterior = true;

			} else if (super.menu == 1) {
				System.out.println("Digite o nome da música: ");
				String nomeMusica = sc.next().concat(sc.nextLine());
				selecionarMusica(nomeMusica);
				return menuanterior = false;
				
			} else if (super.menu == 2) {
				tocarMusica();
				return menuanterior = false;
			} else if (super.menu == 3) {
				pausarMusica();
				return menuanterior = false;
			} else if (super.menu == 4) {
				avancarMusica();
				return menuanterior = false;
			} else if (super.menu == 5) {
				voltarMusica();
				return menuanterior = false;
			} else if (super.menu == 6) {
				menuVolume();		
				return menuanterior = false;
			} else {
				System.out.println("Opção inválida.");
				return menuanterior = true;
			}
			
		
		}
		
	
	

	private void pausarMusica() {
		System.out.println("Música pausada.");
	}
	
	private void tocarMusica() {
		System.out.println("Tocando música: " + musicas.get(posicaoMusicaAtual) + "\nPosição na playlist: " + posicaoMusicaAtual);
	}
	
	private void avancarMusica() {
	    if (musicas.size() <= 1) {
	        System.out.println("Não há mais músicas na playlist.");
	    } else if (posicaoMusicaAtual < musicas.size() - 1) {
	        posicaoMusicaAtual++;
	        System.out.println("Música avançada.");
	        System.out.println("Tocando música: " + musicas.get(posicaoMusicaAtual) + " na posição " + posicaoMusicaAtual);
	    } else {
	        System.out.println("Você já está na última música da playlist.");
	    }
	}
	
	private void voltarMusica() {
	    if (musicas.size() <= 1) {
	        System.out.println("Não há mais músicas na playlist.");
	    } else if (posicaoMusicaAtual > 0) {
	        posicaoMusicaAtual--;
	        System.out.println("Música retrocedida.");
	        System.out.println("Tocando música: " + musicas.get(posicaoMusicaAtual) + " na posição " + posicaoMusicaAtual);
	    } else {
	        System.out.println("Você já está na primeira música da playlist.");
	    }
	}	
	
	private void selecionarMusica(String nomeMusica) {
		System.out.println("Música selecionada: " + nomeMusica);
		musicas.add(nomeMusica);
		posicaoMusicaAtual = musicas.indexOf(nomeMusica);
		System.out.println("Posição na playlist da musica " + nomeMusica + ": " + posicaoMusicaAtual);
		System.out.println(" Você tem " + musicas.size() + " na Playlist.");
	}
	
	
}
