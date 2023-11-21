package atividadeManzano;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = 0;
		int mv = 0;
		do {
			System.out.println("me informe um numero positivo ou negativo inteiro"+"\nPs:(Caso o numero seja negativo o codigo ira parar)"+"\nNumero:");
				valor1 = sc.nextInt();
				if(mv<valor1){
					mv=valor1;
			}
				
		}
		while(valor1>=0);
			System.out.println("O maior numero informado foi "+mv+"\nE o menor numero foi "+valor1);
		sc.close();
		
	}

}
