package Exercicios5a43;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do seu salario: ");
		double Salario=sc.nextDouble();
		
		System.out.println("Digite quantas horas trabalhadas você possui no mês: ");
		int HorasT=sc.nextInt();
		
		System.out.println("Digite em quantas horas extras você trabalhou: ");
		int HorasX=sc.nextInt();
		
		double SalarioH=Salario/160;
		double SalarioHR=(SalarioH*50)/100;
		double SalarioR=SalarioH+SalarioHR;
		double SalarioX=SalarioR*HorasX;
		double SalarioFinal=Salario+SalarioX;
		
		if(HorasT>160) 
		{
			System.out.println("Você trabalhou "+HorasT+" Horas, o seu salario final é de: R$"+SalarioFinal+" Reais.");
		}
		else 
		{
			System.out.println("Você trabalhou "+HorasT+" Horas, o seu salario final é de: R$"+SalarioFinal+" Reais.");
		}
		sc.close();
	}

}






//double Salariosemanal=Salario/4;
//double Ajuste=(Salariosemanal*50)/100;
//double Ajuste2=Ajuste*Semanas;
//double SalarioFinal=Salario+Ajuste2;

//if(HorasT>160) 
//{
	//System.out.println("você trabalhou "+HorasT+" Horas, o seu salario final é de: R$"+SalarioFinal+" Reais");
//}
//else 
//{
	//System.out.println("você trabalhou "+HorasT+" Horas, o seu salario final é de: R$"+SalarioFinal+" Reais");
//}
