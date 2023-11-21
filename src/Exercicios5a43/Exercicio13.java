package Exercicios5a43;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da sua nota");
		double NotaA=sc.nextDouble();
		
		System.out.println("Digite o valor da sua nota");
		double NotaB=sc.nextDouble();
		
		System.out.println("Digite o valor da sua nota");
		double NotaC=sc.nextDouble();
		
		double CalculoA=NotaA*2;
		double CalculoB=NotaB*3;
		double CalculoC=NotaC*5;
		double Media= (CalculoA+CalculoB+CalculoC)/10;
		
		System.out.println("Sua média final é de: "+Media);
		
		sc.close();
	}

}
