package Exercicios5a43;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a idade de um homem: ");
		int HomemIda=sc.nextInt();
		
		System.out.println("Digite a idade de outro homem: ");
		int HomemIda2=sc.nextInt();
		
		System.out.println("Digite a idade de uma mulher: ");
		int MulherIda=sc.nextInt();
		
		System.out.println("Digite a idade de outra mulher:  ");
		int MulherIda2=sc.nextInt();
		
		int Soma1=0;
		int Soma2=0;
		
		if(HomemIda>HomemIda2 && MulherIda>MulherIda2) 
		{
			Soma1=HomemIda+MulherIda;
			Soma2=HomemIda2+MulherIda2;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de: "+Soma1+" E a soma da idade da mulher mais velha com o homem mais novo é de: "+Soma2);
		}
		else if(HomemIda2>HomemIda && MulherIda>MulherIda2)
		{
			Soma1=HomemIda2+MulherIda;
			Soma2=HomemIda+MulherIda2;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de: "+Soma1+" E a soma da idade da mulher mais velha com o homem mais novo é de: "+Soma2);		
		}
		else if(HomemIda>HomemIda2 && MulherIda2>MulherIda) 
		{
			Soma1=HomemIda+MulherIda2;
			Soma2=HomemIda2+MulherIda;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de: "+Soma1+" E a soma da idade da mulher mais velha com o homem mais novo é de: "+Soma2);
		}
		else 
		{
			Soma1=HomemIda2+MulherIda2;
			Soma2=HomemIda+MulherIda;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de: "+Soma1+" E a soma da idade da mulher mais velha com o homem mais novo é de: "+Soma2);
		}
	}

}
