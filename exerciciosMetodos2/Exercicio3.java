package exerciciosMetodos2;

public class Exercicio3 {
	public static void main(String[] args) {
		double area = CalcularAreaRetangulo(5, 10);
		
		System.out.println("A �rea do retangulo � de: " + area);
	}
	
	public static double CalcularAreaRetangulo(double largura, double altura) {
		return largura * altura;
		
	}
}
