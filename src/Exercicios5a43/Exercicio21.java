package Exercicios5a43;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite a hora de inicio do jogo de xadrez: ");
		int inicio=sc.nextInt();
		
		System.out.println("Digite a hora do final do jogo de xadrez ");
		int termino=sc.nextInt();
		
		int HorasJogo=(inicio+termino)-24;
		
		System.out.println("A partida de xadrez durou exatas: "+HorasJogo+"Horas");
		
		sc.close();

	}

}
