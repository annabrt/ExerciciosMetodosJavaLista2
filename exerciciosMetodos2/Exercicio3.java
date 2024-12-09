package exerciciosMetodos2;

public class Exercicio3 {
	public static void main(String[] args) {
		double area = CalcularAreaRetangulo(5, 10);
		
		System.out.println("A área do retangulo é de: " + area);
	}
	
	public static double CalcularAreaRetangulo(double largura, double altura) {
		return largura * altura;
		
	}
}
