package exerciciosMetodos2;

public class Exercicio5 {

	public static void main(String[] args) {
		int numeroMenor = ObterNumeroMenor(12, 5, 3);
		
		System.out.println("O numero menor é: " + numeroMenor);
	}
	
	public static int ObterNumeroMenor(int num1, int num2, int num3) {
		int menor = num1;
		
		if(num2 < menor) {
			menor = num2;
		}
		
		if (num3 < menor) {
			
			menor = num3;
		}
		return menor;
	}

}
