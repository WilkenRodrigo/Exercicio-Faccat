package atividadeManzano;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int contadora=0;
		for(int i=0; i<501; i++)
		{
			if(i%2==0) 
			{
				contadora=contadora+i;
			}
			
		}
		System.out.println("A soma dos 500 primeiros numeros pares é de: "+contadora);
	}

}
