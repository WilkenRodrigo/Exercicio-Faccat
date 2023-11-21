package Exercicios5a43;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Me informe a sua primeira nota: ");
		double Nota1=sc.nextDouble();
		System.out.println("Me informe a sua segunda nota: ");
		double Nota2=sc.nextDouble();
		System.out.println("Me informe a sua terceira nota: ");
		double Nota3=sc.nextDouble();
		
		double soma= Nota2*2;
		double soma2=Nota3*3;
		double NotaF=Nota1+Nota2+Nota3;
		double Media=NotaF/7;
		
		if(Media>=9) 
		{
			System.out.println("A sua media final é: A");
		}
		else if(Media>=7.5 && Media<9)
		{
			System.out.println("A sua media final é: B");
		}
		else if(Media>=6 && Media<7.5) 
		{
			System.out.println("A sua media final é: C");
		}
		else 
		{
			System.out.println("A sua media final é: D");
		}
	}

}
