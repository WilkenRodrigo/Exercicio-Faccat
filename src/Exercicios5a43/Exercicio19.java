package Exercicios5a43;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero qualquer: ");
		int valor=sc.nextInt();
		
		System.out.println("Agora digite outro valor que não seja igual ao anterio por favor: ");
		int valor2=sc.nextInt();
		
		if(valor>valor2) 
		{
			System.out.println("O valor "+valor+" É maior que o valor "+valor2);
		}
		else 
		{
			System.out.println("O valor "+valor2+" É maior que o valor "+valor);
		}
		sc.close();
	}

}
