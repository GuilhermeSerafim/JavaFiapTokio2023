package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("Seu primeiro numero e maior");
		}else if(num1 < num2) {
			System.out.println("Seu segundo numero e maior");
		}else {
			System.out.println("Ambos sao iguais");
		}
		
		entrada.close();
	}

}
