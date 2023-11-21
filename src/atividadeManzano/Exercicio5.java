package atividadeManzano;

public class Exercicio5 {

	public static void main(String[] args) {
		 // Inicializando a variável com a base
		int resultado = 1;

		        // Exibindo o resultado para expoente 0
		  System.out.println("3^0 = " + resultado);

		        // Calculando e exibindo as potências de 3 para expoentes de 1 a 15
		   for (int expoente = 1; expoente <= 15; expoente++) {
		            resultado = resultado* 3;
		            System.out.println("3^" + expoente + " = " + resultado);
	    }

	}

}
