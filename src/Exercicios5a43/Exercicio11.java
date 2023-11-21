package Exercicios5a43;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o salario fixo: ");
		double SalarioFixo=sc.nextDouble();
		
		System.out.println("Digite o valor da comissão fixa por vendas de carro: ");
		double VendasFixas=sc.nextDouble();
		
		System.out.println("Digite o valor de carros vendidos: ");
		double NumeroVendas=sc.nextDouble();
		
		System.out.println("Digite o valor total de suas vendas: ");
		double ValorTotalVendas=sc.nextDouble();
		
		VendasFixas=VendasFixas*NumeroVendas;
		double ValorVendas=(ValorTotalVendas*5)/100;
		double ValorFinal=VendasFixas+SalarioFixo+ValorVendas;
		
		System.out.println("O valor final do seu salario é de: "+ValorFinal);
		
		sc.close();
	}

}
