package Programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		String nome,idade,pais,estado,cidade;
		System.out.println("Por favor,digite seu nome:");
		nome = in.nextLine();
		System.out.println("Por favor,digite sua idade:");
		idade = in.nextLine();
		System.out.println("Por favor,digite o nome do seu pa�s:");
		pais = in.nextLine();
		System.out.println("Por favor,digite o nome do seu estado:");
		estado = in.nextLine();
		System.out.println("Por favor,digite o nome da sua cidade:");
		cidade = in.nextLine();
		System.out.println("---------------------");
		System.out.println("Aqui est� o resultado final:");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Pa�s: "+pais);
		System.out.println("Estado: "+estado);
		System.out.println("Cidade: "+cidade);
		*/
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		System.out.println("Seja bem vindo ao jogo! Insira seu nome:");
		nome = in.nextLine();
		System.out.println("Seja muito bem vindo, "+nome+".");
		System.out.println("Para qual dire��o voc� deseja ir? (w,a,s ou d?");
		String comando = in.nextLine();
		
		if(comando.equals("w") ) 
		{
			System.out.println("Um inimigo apareceu! WATARIU DO?");
			System.out.println("Poder� atacar ou fugir!(a=atacar c=correr) Oque ir� fazer?");
			comando = in.nextLine();
			if(comando.equals("a"))
			{ 
				System.out.println("Voc� atacou");
				if( rand.nextInt(100) <75) {
					System.out.println("Parab�ns, voc� ganhou!");
				}else {
					System.out.println("PUTZ!");
				}
			}
			
		}else {
			System.out.println("Nada aqui :C");
		}
	}
	
}
