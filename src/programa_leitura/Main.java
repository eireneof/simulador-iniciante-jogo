package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		
		String nome;
		
		System.out.println("Seja Bem-Vindo ao Jogo! Insira seu nome: ");
		nome = in.nextLine();
		
		System.out.println("É um prazer te conhecer, " + nome);
		System.out.println("Você deseja avançar para qual direção?");
		System.out.println("(w) (s) (a) (d)");
		System.out.println("?");
		
		String comando = in.nextLine();
		
		if(comando.equals("w")) { //ESCOLHA (w)
			System.out.println("Você está indo para frente!");
			System.out.println("...");
			System.out.println("Surgiu um inimigo! O que você vai fazer?");
			System.out.println("(a) - atacar ");
			System.out.println("(c) - correr ");
			
			comando = in.nextLine();
			
			if(comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("Você ganhou o jogo! :)");
				} else {
					System.out.println("Você perdeu o jogo! :(");
				}
			} else if(comando.equals("c")) {
				System.out.println("Você correru e o jogo terminou...");
			} else {
				System.out.println("Você digitou uma opção inválida e perdeu!");
			}
		} else if(comando.equals("s")) { //ESCOLHA (s)
			System.out.println("Que pena, "+nome);
			System.out.println("Você se perdeu e acabou entrando em outro mapa... :/");
		} else if (comando.equals("a")) { //ESCOLHA (a)
			System.out.println("Você andou demais e ficou exautx.");
			System.out.println("Só restam agora duas opções: ");
			System.out.println("(p) - parar e descansar");
			System.out.println("(c) - continuar mesmo assim");
			comando = in.nextLine();
			if(comando.equals("p")) {
				if(rand.nextInt(100) < 80) {
					System.out.println("Você recuperou suas energias e conseguiu ganhar o jogo! :)");
				} else {
					System.out.println("Infelizmente você foi atacadx enquanto descansava e perdeu... :(");
				}
			} else if(comando.equals("c")) {
				if(rand.nextInt(100) < 85) {
					System.out.println("Sua teimosia te fez desfalecer pelo caminho e você perdeu... :'(");
			
				} else {
					System.out.println("Mesmo sendo teimosx, sua persistência te fez ganhar o jogo! :)");
				}
			} else {
				System.out.println("Você digitou uma opção inválida e perdeu!");
			}
		} else if (comando.equals("d")) { 
	
			System.out.println("Sua água está acabando! O que você fará?");
			System.out.println("(p) - procurar um riacho");
			System.out.println("(s) - seguir e procurar amanhã, pois já está ficando escuro");
			comando = in.nextLine();
			if(comando.equals("p")) {
				if(rand.nextInt(100) < 50) {
					System.out.println("Você achou um riacho e pôde se hidratar!");
					System.out.println("O mais legal é que você achou um barco abandonado que te fez passar por um riacho secreto.");
					System.out.println("Esse caminho secreto te manteve a salvo e você ganhou o jogo! :)");
			
				} else {
					System.out.println("Você achou um riacho e pôde hidratar-se!");
					System.out.println("Porém haviam inimigos escondidos próximos à margem.");
					System.out.println("Eles te atacaram e, infelizmente, você perdeu... :(");
				}
			} else if(comando.equals("s")) {
				System.out.println("Com sede e frio, você decidiu abrigar-se em uma caverna.");
				System.out.println("Você não esperava que ela desse em um rio secreto.");
				System.out.println("Você conseguiu hidratar-se, alimentar-se e aquecer-se.");
				System.out.println("No outro dia, cheio de energia, você seguiu o seu caminho.");
				System.out.println("Qual lado você escolhe?");
				System.out.println("(e) - esquerda ");
				System.out.println("(d) - direita ");
				comando = in.nextLine();
				if(comando.equals("e")) {
					//System.out.println();
					System.out.println("O caminho foi árduo, mas com muita persistência, você ganhou o jogo!");
				} else if (comando.equals("d")) {
					if(rand.nextInt(100) < 70) {
						System.out.println("Você caiu em uma emboscada e perdeu o jogo! ;(");
					} else {
						System.out.println("O caminho foi árduo, mas com muita persistência, você ganhou o jogo!");
					}
				} else {
					System.out.println("Você digitou uma opção inválida e perdeu!");
				}
			} else {
				System.out.println("Você digitou uma opção inválida e perdeu!");
			}
		} else {
			System.out.println("Você digitou uma opção inválida e perdeu!");
		}
	
	}
}
