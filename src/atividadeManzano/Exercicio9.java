package atividadeManzano;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i=0;
		int valor1;
		int valor2=0;
		
		do {
			i++;
			System.out.println("Me informe a "+i+" Nota por favor");
			valor1= sc.nextInt();
			valor2 = valor2+valor1;
		   }
		while(valor1>=0 && i<10);
		
		System.out.println("O total da suas notas foram de: "+valor2+" E a media foi de: "+valor2/10);
		sc.close();
	}

}
