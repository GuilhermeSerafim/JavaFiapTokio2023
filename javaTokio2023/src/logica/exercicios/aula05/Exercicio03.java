package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char masculino = 'M';
		char feminino = 'F';
		char outro = 'O';
		char naoResponder = 'N';
		
		char generoEscolhido = entrada.nextLine();
		if(masculino == generoEscolhido) {
			System.out.print("Olá Alexandre! Você escolheu a seguinte opção de gênero " + masculino);
		} else if(feminino == generoEscolhido) {
			System.out.print("Olá Alexandre! Você escolheu a seguinte opção de gênero: " + feminino);
		} else if(outro == generoEscolhido) {
			System.out.print("Olá Alexandre! Você escolheu a seguinte opção de gênero: " + outro);
		} else if(naoResponder == generoEscolhido) {
			System.out.print("Olá Alexandre! Você escolheu a seguinte opção de gênero: " + naoResponder);
		}
	}

}
