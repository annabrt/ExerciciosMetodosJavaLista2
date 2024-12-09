package exerciciosMetodos2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Exercicio1 {

	public static void main(String[] args) {
		
		ExibirHoraAtual();
	}
	
	public static void ExibirHoraAtual() {
		LocalTime horaAtual = LocalTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		String horaFormatada = horaAtual.format(formatter);
		
		System.out.println(horaFormatada);
	}

}
