package Exercicios5a43;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit");
		double ValorF=sc.nextDouble();
		
		double CalculoA=ValorF-32;
		double CalculoB=CalculoA*5;
		double GrausCelsius=CalculoB/9;
		
		System.out.println("O valor desta temperatura em graus Celsius é de: "+GrausCelsius);
		
		sc.close();
		
	}

}
