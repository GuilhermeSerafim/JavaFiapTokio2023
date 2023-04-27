	package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos km voce correu com seu automovel?");
		float distancia = entrada.nextFloat();
		
		System.out.println("Quanto de combustivel o seu automovel consumiu?");
		float volume = entrada.nextFloat();
		
		float consumo = distancia / volume;
		System.out.println("Seu consumo e de: " + consumo + " km/l");
		
		
		if(volume == 0) {
			System.out.println("Seu carro e uma bicicleta");
		} else {
			System.out.println("Seu carro nao e uma bicicleta");
		}
		System.out.println("");
		if(consumo < 8) {
			System.out.println("Autonomia boa");
		} else {
			System.out.println("Autonomia ruim");
		}
		entrada.close();
		
	}

}
