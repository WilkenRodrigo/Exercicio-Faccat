package Exercicios5a43;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o valor do seu salario atual: ");
		double SalarioAtual=sc.nextDouble();
		
		System.out.println("Digite o valor percentual do reajuste: ");
		double reajuste=sc.nextDouble();
		
		double ValorReajuste=(SalarioAtual*reajuste)/100;
		double NovoSalario=SalarioAtual+ValorReajuste;
		
		System.out.println("O valor do seu salario atual é de: R$"+NovoSalario);
		
		sc.close();

	}

}
