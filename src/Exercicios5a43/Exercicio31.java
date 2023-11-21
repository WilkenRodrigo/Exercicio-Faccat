package Exercicios5a43;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int A= sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int B= sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int C= sc.nextInt();
		
		if(A< B + C && B< C+A && C<A+B) 
		{
			System.out.println("Isso é Um Triângulo!!!");
			
		}
		else {
			System.out.println("Isso não é um Triângulo");
			
		     }
		sc.close();
	}

}
