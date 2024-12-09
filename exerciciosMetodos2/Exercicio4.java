package exerciciosMetodos2;

public class Exercicio4 {

	public static void main(String[] args) {
		double perimetro = CalcularPerimetroCirculo(7);
		
		System.out.println("O perimetro do circulo é de: " + perimetro);
		

	}
	
	public static double CalcularPerimetroCirculo(double raio) {
		double perimetro = 2 * Math.PI * raio;
		return perimetro;
	}

}
