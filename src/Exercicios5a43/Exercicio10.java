package Exercicios5a43;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o preço de fábrica do carro: ");
		double PreçoFabrica=sc.nextDouble();
		
		double percentualDis=(PreçoFabrica*28)/100;
		double Imposto=(PreçoFabrica*45)/100;
		double ValorFinal=PreçoFabrica+percentualDis+Imposto;
		
		System.out.println("O valor final do seu carro é de: "+ValorFinal);
		
		sc.close();

	}

}
