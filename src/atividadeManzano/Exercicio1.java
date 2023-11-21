package atividadeManzano;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor que você queira saber a tabuada: ");
		int valor1=sc.nextInt();
		
		int contadora=1;
		
		while(contadora<11) 
		{
			System.out.println(valor1+"X"+contadora+"="+valor1*contadora);
			contadora++;
		}
		sc.close();

	}

}
