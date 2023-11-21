package Exercicios5a43;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o total de eleitores do municipio: ");
		double totmun=sc.nextDouble();
		
		System.out.println("Digite o valor total de votos brancos: ");
		double votbrancos=sc.nextDouble();
		
		System.out.println("Digite o valor total de votos nulos: ");
		double votnulos=sc.nextDouble();
		
		System.out.println("Digite o valor total de votos válidos: ");
		double votvalidos=sc.nextDouble();
		
		votbrancos=(votbrancos/totmun)*100;
		votnulos=(votnulos/totmun)*100;
		votvalidos=(votvalidos/totmun)*100;
		
		double totalbrancos= votbrancos;
		double totalnulos=   votnulos;
		double totalvalidos= votvalidos;
		
		System.out.println("O total de votods brancos é de: "+totalbrancos+" %");
		System.out.println("O total de votos nulos é de: "+totalnulos+" %");
		System.out.println("O total de votos válidos é de: "+totalvalidos+" %");
		
		sc.close();
		
	}

}
