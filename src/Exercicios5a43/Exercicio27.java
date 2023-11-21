package Exercicios5a43;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor qualquer: ");
		int valor=sc.nextInt();
		
		if(valor>0) 
		{
			System.out.println("O valor digitado é positivo!");
		}
		else if (valor<0)
		{
			System.out.println("O valor digitado é negativo!");
		}
		else 
		{
			System.out.println("O valor digitado é zero");
		}
		sc.close();
	}

}
