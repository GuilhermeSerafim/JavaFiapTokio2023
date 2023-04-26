package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero:");
		int num1 = entrada.nextInt();
		System.out.println("Escreva o segundo numero:");
		int num2 = entrada.nextInt();
		System.out.println("Realize a operacao:");
		char operacao = entrada.nextLine(); //não sei como prosseguir daqui
		System.out.println(operacao);
		
		entrada.close();
	}

}
