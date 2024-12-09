package exerciciosMetodos2;

public class Exercicio9 {

	public static void main(String[] args) {
		String resultado = InverterString("invertendo a string");
		
		System.out.println("A string invertida é: " + resultado);
	}
	
	public static String InverterString(String str) {
		String invertida = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			invertida += str.charAt(i);
		}
		return invertida;
	}

}
