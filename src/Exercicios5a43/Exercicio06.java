package Exercicios5a43;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do seu retângulo: ");
		int base=sc.nextInt();
		
		System.out.println("Agora digite o valor da altura do seu retângulo: ");
		int altura=sc.nextInt();
		
		int area=base*altura;
		
		System.out.println("O valor da área do seu retângulo é: "+area);

		sc.close();
	}

}
