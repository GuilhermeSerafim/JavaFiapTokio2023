package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//PEÇA 1 
		System.out.println("Digite o nome da peca 1: ");
		String nomePeca1 = entrada.nextLine();
		
		System.out.println("Digite o numero de pecas: ");
		int numPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\n");
		
		System.out.println("Nome da peca 1: " + nomePeca1);
		System.out.println("Quantidade de pecas 1 : " + numPecas1);
		
		
		float valorPeca1 = 1.0f;
		float valorTotal1 = valorPeca1 * numPecas1; //valor da peça 1
		System.out.println("\n");
		
		//PEÇA 2
		System.out.println("Digite o nome da peca 2: ");
		String nomePeca2 = entrada.nextLine();
		
		System.out.println("Digite o numero de pecas: ");
		int numPecas2 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\n");
		
		System.out.println("Nome da peca 2: " + nomePeca2);
		System.out.println("Quantidade de pecas 2: " + numPecas2);
		
		float valorPeca2 = 5.0f;
		float valorTotal2 = valorPeca2 * numPecas2;
		
		System.out.println("\n");
		
		System.out.println("O valor a ser pago: " + (valorTotal2 + valorTotal1) + "0$");
				
		
	}

}
