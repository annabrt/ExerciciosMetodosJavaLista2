package exerciciosMetodos2;

public class Exercicio8 {

	public static void main(String[] args) {
		double temperaturaF = ConverterCparaF(34);
		
		System.out.println("A temperatura em Fahrenheit é: " + temperaturaF);
		

	}
	
	public static double ConverterCparaF(double celsius) {
		double fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
	}

}
