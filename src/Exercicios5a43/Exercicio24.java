package Exercicios5a43;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o valor do seu salario fixo: ");
		double SalarioF=sc.nextDouble();
		
		System.out.println("Digite o valor de vendas efetuadas: ");
		double Vendas=sc.nextDouble();
		double VendasR=(Vendas*3)/100;
		if(Vendas>1500) 
		{
			double VendasA=(Vendas%1500*5)/100;
			double SalarioFinal=Vendas+VendasR+VendasA;
			
			System.out.println("O seu salario final é de: "+SalarioFinal);
		}
		else  
		{
			System.out.println("O seu salario é de: "+SalarioF);
		}
		sc.close();

	}

}
