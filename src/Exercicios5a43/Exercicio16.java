package Exercicios5a43;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero de maças compradas: ");
		double compradas=sc.nextDouble();
		
		if(compradas>=12) 
		{
			compradas=1*compradas;
		}
		else 
		{
			compradas=1.30*compradas;
		}
		System.out.println("O valor final da sua compra é de: R$"+compradas+" Reais.");
		
		sc.close();
	}

}
