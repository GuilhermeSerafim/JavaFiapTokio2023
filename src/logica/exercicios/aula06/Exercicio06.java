package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento");
		int anoNasc = entrada.nextInt();
		int idade = 2023 - anoNasc;
		
		if(idade >= 18) {
			System.out.println("Voto obrigatorio");
		}else {
			System.out.println("Voto nao obrigatorio");
		}
		
		entrada.close();
	}

}
