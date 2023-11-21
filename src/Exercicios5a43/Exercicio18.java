package Exercicios5a43;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua data de nascimento por favor: ");
		int nascimento=sc.nextInt();
		
		int idade=2023-nascimento;
		
		if(idade>=16) 
		{
			System.out.println("Você tem "+idade+" Anos, Você ja pode votar!");
		}
		else 
		{
			System.out.println("Você tem "+idade+" Anos, Você não pode votar ainda! ");
		}
		sc.close();
	}

}
