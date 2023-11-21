package Exercicios5a43;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem: ");
		int anos=sc.nextInt();
		
		System.out.println("Digite quantos meses você tem: ");
		int meses=sc.nextInt();
		
		System.out.println("Digite quantos dias você tem: ");
		int dias=sc.nextInt();
		
		anos=anos*365;
		meses=meses*30;
		int total=anos+meses+dias;
		
		System.out.println("O total de dias que você tem de vida é: "+total);
		
		sc.close();

	}

}
