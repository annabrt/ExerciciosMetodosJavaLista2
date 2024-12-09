package exerciciosMetodos2;

public class Exercicio10 {

	public static void main(String[] args) {
		double hipotenusa = CalcularHipotenusa(3, 4);
		System.out.println("A hipotenusa é: " + hipotenusa);

	}
	
	public static double CalcularHipotenusa(double cateto1, double cateto2) {
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		return hipotenusa;
	}

}
