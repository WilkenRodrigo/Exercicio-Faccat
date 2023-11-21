package atividadeManzano;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int sm=0;
		int j=0;
		
		for(int i=50; i<71; i++) 
		{
			if(i%2==0) {
				System.out.println(i);
				sm= sm + i;
				j++;
			}
		}
		System.out.println("A soma de todos os numeros pares entre 50 e 70 é de: "+sm+" E a media aritimetica deles é de: "+sm/j);
	}

}
