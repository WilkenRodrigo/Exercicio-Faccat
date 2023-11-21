package Exercicios5a43;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor=sc.nextInt();
		
		valor=valor-1;
		
		System.out.println("O antecessor do valor digitado é: "+valor);
		
		sc.close();
	}
	
}
