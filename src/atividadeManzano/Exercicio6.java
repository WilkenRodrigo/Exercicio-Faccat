package atividadeManzano;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Me informe a base da sua potencia por favor ");
		int Base = sc.nextInt();
		System.out.println("Agora me informe o expoente da sua potencia");
		int Ex = sc.nextInt();
		int C=Base;
		for( int i=1; i<=Ex; i++) {
				C = C*Base;
			System.out.println(C);
		}
		System.out.println("O valor final de "+Base+"^"+Ex+"\nÉ: "+C);
		sc.close();

	}

}
