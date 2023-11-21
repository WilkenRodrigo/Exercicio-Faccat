package Exercicios5a43;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite um valor qualquer");
		int valor=sc.nextInt();
		
		if(valor>10) 
		{
			System.out.println("O valor digitado É MAIOR QUE 10!");
		}
		else 
		{
			System.out.println("Não É MAIOR QUE 10!");
		}
		sc.close();
	}

}
