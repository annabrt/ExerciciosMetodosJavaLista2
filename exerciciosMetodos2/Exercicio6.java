package exerciciosMetodos2;

public class Exercicio6 {

	public static void main(String[] args) {
		boolean resultado = EhPrimo(7);
		
		if (resultado) {
			System.out.println("O n�mero � primo.");
		} else {
			System.out.println("O n�mero n�o � primo.");
		}

	}
	
	public static boolean EhPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
	
		return true;
	
	}
	

}
