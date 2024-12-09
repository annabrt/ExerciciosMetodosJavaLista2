package exerciciosMetodos2;
import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) {

		int numeroAleatorio = GerarNumeroAleatorio();
		System.out.println("O número aleatório gerado é: " + numeroAleatorio);
		
	}
	
	public static int GerarNumeroAleatorio() {
		Random random = new Random();
		int numero = random.nextInt(100) + 1;
		return numero;
	}

}
