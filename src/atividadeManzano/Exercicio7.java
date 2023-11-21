package atividadeManzano;

public class Exercicio7 {

	public static void main(String[] args) {
		int valor = 15; 

        
        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até o décimo quinto termo:");

        
        System.out.print(primeiroTermo + ", " + segundoTermo);

        
        for (int i = 3; i <= valor; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

	}

}
