package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int num, soma = 0;
		System.out.print("Digite um número: ");
		num = tec.nextInt();
		soma = soma + num;
		System.out.print("Digite um número: ");
		num = tec.nextInt();
		soma = soma + num;
		System.out.print("Digite um número: ");
		num = tec.nextInt();
		soma += num;
		System.out.println("O resultado é: " + soma);
		
		tec.close();

	}

}
