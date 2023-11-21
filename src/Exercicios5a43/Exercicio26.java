package Exercicios5a43;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o numero atual de produtos em estoque: ");
		double Estoque=sc.nextDouble();
		
		System.out.println("Digite o numero maximo de estoque desse produto: ");
		double EstoqueMA=sc.nextDouble();
		
		System.out.println("Digite o numero minimo de estoque desse produto: ");
		double EstoqueMI=sc.nextDouble();
		
		double Media=(EstoqueMA+EstoqueMI)/2;
		if (Estoque>=Media) 
		{
			System.out.println("Não efetuar compra!");
		}
		else 
		{
			System.out.println("Efetuar compra!");
		}
		sc.close();
	}

}
