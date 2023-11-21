package Exercicios5a43;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escreva um valor: ");
		int valor=sc.nextInt();
		
		System.out.println("Escreva um segundo valor diferente do primeiro: ");
		int valor2=sc.nextInt();
		
		if(valor>valor2) 
		{
			System.out.println("A ordem crescente dos numeros Digitados é: "+valor2+", "+valor);
		}
		else 
		{
			System.out.println("A ordem crescente dos numeros Digitados é: "+valor+", "+valor2);
		}
		sc.close();
	}

}
