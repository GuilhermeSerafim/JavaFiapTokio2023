package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		int nota1 = entrada.nextInt();
		System.out.println("Entre com a segunda nota:");
		int nota2 = entrada.nextInt();
		System.out.println("Entre com a terceira nota:");
		int nota3 = entrada.nextInt();
		System.out.println("Entre com a quarta nota:");
		int nota4 = entrada.nextInt();
		
		int totalNotas = nota1 + nota2 + nota3 + nota4;
		int mediaNotas = totalNotas / 4;
		
		if(mediaNotas >= 7) {
			System.out.println("Aprovado");
		} else if(mediaNotas >= 5 && mediaNotas < 7) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Reprovado");
		}
		
		entrada.close();

	}

}
