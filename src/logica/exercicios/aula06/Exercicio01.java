package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu numero: ");
		int num = entrada.nextInt();

		if((num % 2) == 0) {
			System.out.println("Seu numero e par");
		} else if((num % 2) == 1) {
			System.out.println("Seu numero e impar");
		}
		
		entrada.close();
	}

}
