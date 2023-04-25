package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char masculino = 'M';
		char feminino = 'F';
		char outro = 'O';
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Siglas dos gêneros: Masculino = 'M', Feminino = 'F' e Outro = 'O'");
		System.out.println("Digite a sigla do seu gênero: ");
		char genEscolhido = '1';
		
		boolean escolhi = false;
		while(escolhi == false) {
			
			System.out.println("Digite a sigla do seu gênero: ");
			genEscolhido = entrada.nextLine().toUpperCase().charAt(0);
			if(genEscolhido == masculino) {
				System.out.println("Olá " + nome + "! Você escolheu a seguinte opção de gênero:" + masculino);
				escolhi = true;
			} else if(genEscolhido == feminino) {
				System.out.println("Olá " + nome + "! Você escolheu a seguinte opção de gênero:" + feminino);
				escolhi = true;
			} else if(genEscolhido == outro) {
				System.out.println("Olá " + nome +  "! Você escolheu a seguinte opção de gênero:" + outro);
				escolhi = true;
			} else {
				System.out.println("Digite apenas as siglas que demos");
			}
		}
		
		entrada.close();
	}

}
