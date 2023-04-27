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
		char operacao = entrada.next().charAt(0); //nao coloque nextLine, apenas next
		System.out.println(operacao);
		
		String status;
		
		switch(operacao) {
			case '+':
				status = "Resultado: " + (num1 + num2);
				System.out.println(status);
				break;
			case '-':
				status = "Resultado: " + (num1 - num2);
				System.out.println(status);
				break;
			case '*':
				status = "Resultado: " + (num1 * num2);
				System.out.println(status);
				break;
			case '/':
				status = "Resultado: " + (num1 * num2);
				System.out.println(status);
				break;
		}

			
		
		
		entrada.close();
	}

}
