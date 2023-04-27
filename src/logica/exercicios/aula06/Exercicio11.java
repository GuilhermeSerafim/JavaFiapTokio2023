package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o codigo do seu estado:");
		int estado = Integer.parseInt(entrada.nextLine());
		System.out.println("Digite o peso da carga do caminhao em toneladas:");
		float pesoCarga = entrada.nextFloat();
		System.out.println("Digite o codigo da carga de 10 a 40");
		int codigoCarga = Integer.parseInt(entrada.nextLine());
		//continua...
	}

}
