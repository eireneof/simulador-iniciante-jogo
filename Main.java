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
		
		System.out.println("� um prazer te conhecer, " + nome);
		System.out.println("Voc� deseja avan�ar para qual dire��o?");
		System.out.println("(w) (s) (a) (d)");
		System.out.println("?");
		
		String comando = in.nextLine();
		
		if(comando.equals("w")) { //ESCOLHA (w)
			System.out.println("Voc� est� indo para frente!");
			System.out.println("...");
			System.out.println("Surgiu um inimigo! O que voc� vai fazer?");
			System.out.println("(a) - atacar ");
			System.out.println("(c) - correr ");
			
			comando = in.nextLine();
			
			if(comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("Voc� ganhou o jogo! :)");
				} else {
					System.out.println("Voc� perdeu o jogo! :(");
				}
			} else if(comando.equals("c")) {
				System.out.println("Voc� correru e o jogo terminou...");
			} else {
				System.out.println("Voc� digitou uma op��o inv�lida e perdeu!");
			}
		} else if(comando.equals("s")) { //ESCOLHA (s)
			System.out.println("Que pena, "+nome);
			System.out.println("Voc� se perdeu e acabou entrando em outro mapa... :/");
		} else if (comando.equals("a")) { //ESCOLHA (a)
			System.out.println("Voc� andou demais e ficou exautx.");
			System.out.println("S� restam agora duas op��es: ");
			System.out.println("(p) - parar e descansar");
			System.out.println("(c) - continuar mesmo assim");
			comando = in.nextLine();
			if(comando.equals("p")) {
				if(rand.nextInt(100) < 80) {
					System.out.println("Voc� recuperou suas energias e conseguiu ganhar o jogo! :)");
				} else {
					System.out.println("Infelizmente voc� foi atacadx enquanto descansava e perdeu... :(");
				}
			} else if(comando.equals("c")) {
				if(rand.nextInt(100) < 85) {
					System.out.println("Sua teimosia te fez desfalecer pelo caminho e voc� perdeu... :'(");
			
				} else {
					System.out.println("Mesmo sendo teimosx, sua persist�ncia te fez ganhar o jogo! :)");
				}
			} else {
				System.out.println("Voc� digitou uma op��o inv�lida e perdeu!");
			}
		} else if (comando.equals("d")) { 
	
			System.out.println("Sua �gua est� acabando! O que voc� far�?");
			System.out.println("(p) - procurar um riacho");
			System.out.println("(s) - seguir e procurar amanh�, pois j� est� ficando escuro");
			comando = in.nextLine();
			if(comando.equals("p")) {
				if(rand.nextInt(100) < 50) {
					System.out.println("Voc� achou um riacho e p�de se hidratar!");
					System.out.println("O mais legal � que voc� achou um barco abandonado que te fez passar por um riacho secreto.");
					System.out.println("Esse caminho secreto te manteve a salvo e voc� ganhou o jogo! :)");
			
				} else {
					System.out.println("Voc� achou um riacho e p�de hidratar-se!");
					System.out.println("Por�m haviam inimigos escondidos pr�ximos � margem.");
					System.out.println("Eles te atacaram e, infelizmente, voc� perdeu... :(");
				}
			} else if(comando.equals("s")) {
				System.out.println("Com sede e frio, voc� decidiu abrigar-se em uma caverna.");
				System.out.println("Voc� n�o esperava que ela desse em um rio secreto.");
				System.out.println("Voc� conseguiu hidratar-se, alimentar-se e aquecer-se.");
				System.out.println("No outro dia, cheio de energia, voc� seguiu o seu caminho.");
				System.out.println("Qual lado voc� escolhe?");
				System.out.println("(e) - esquerda ");
				System.out.println("(d) - direita ");
				comando = in.nextLine();
				if(comando.equals("e")) {
					//System.out.println();
					System.out.println("O caminho foi �rduo, mas com muita persist�ncia, voc� ganhou o jogo!");
				} else if (comando.equals("d")) {
					if(rand.nextInt(100) < 70) {
						System.out.println("Voc� caiu em uma emboscada e perdeu o jogo! ;(");
					} else {
						System.out.println("O caminho foi �rduo, mas com muita persist�ncia, voc� ganhou o jogo!");
					}
				} else {
					System.out.println("Voc� digitou uma op��o inv�lida e perdeu!");
				}
			} else {
				System.out.println("Voc� digitou uma op��o inv�lida e perdeu!");
			}
		} else {
			System.out.println("Voc� digitou uma op��o inv�lida e perdeu!");
		}
	
	}
}
