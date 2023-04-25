package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor em reais: ");
		float real = entrada.nextFloat();
		
		float dolar = real * 0.20f;
		float euro = real * 0.18f;
		float pArgentino = real * 43.64f;
		float libra = real * 0.16f;
		float iene = real * 26.39f;
		
		System.out.println("Valor em dolar: " + dolar);
		System.out.println("Valor em euro: " + euro);
		System.out.println("Valor em peso argentino: " + pArgentino);
		System.out.println("Valor em libras: " + libra);
		System.out.println("Valor em iene: " + iene);
		
		entrada.close();
	}

}
