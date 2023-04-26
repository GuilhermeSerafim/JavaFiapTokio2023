package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipos de cliente:");
		System.out.println("Digite '1' se voce for uma residencia");
		System.out.println("Digite '2' se voce for um comercio");
		System.out.println("Digite '3' se voce for uma industria");
		int tipoDeCliente = entrada.nextInt();
		
		float valorConta = 1;
		boolean acheiCliente = false;
		while(acheiCliente == false) {
			if(tipoDeCliente == 1 || tipoDeCliente == 2 || tipoDeCliente == 3) {
				System.out.println("Digite o valor da sua conta:");
				valorConta = entrada.nextFloat();
				acheiCliente = true;
			} else {
				System.out.println("Nao identificamos qual e o seu tipo de cliente. Tente novamente");
				acheiCliente = false;
			}
		}
		
		
		float residencia = valorConta * 0.60f;
		float comercio = valorConta * 0.48f;
		float industria = valorConta * 1.29f;
		
		if(tipoDeCliente == 1) {
			System.out.println("O valor da sua conta e: " + residencia);
		} else if(tipoDeCliente == 2) {
			System.out.println("O valor da sua conta e: " + comercio);
		} else if(tipoDeCliente == 3) {
			System.out.println("O valor da sua conta e: " + industria);
		}
		
		entrada.close();

	}

}
