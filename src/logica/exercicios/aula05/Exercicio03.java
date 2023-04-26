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
		
		System.out.println("Siglas dos generos: Masculino = 'M', Feminino = 'F' e Outro = 'O'");
		System.out.println("Digite a sigla do seu genero: ");
		char genEscolhido = '1'; //aqui o professor tentou atribuir uma variavel vazia
		
		boolean escolhi = false;
		while(escolhi == false) {
			
			genEscolhido = entrada.nextLine().toUpperCase().charAt(0);
			if(genEscolhido == masculino) {
				System.out.println("Ola " + nome + "! Voce escolheu a seguinte opcao de genero:" + masculino);
				escolhi = true;
			} else if(genEscolhido == feminino) {
				System.out.println("Ola " + nome + "! Voce escolheu a seguinte opcao de genero:" + feminino);
				escolhi = true;
			} else if(genEscolhido == outro) {
				System.out.println("Ola " + nome +  "! Voce escolheu a seguinte opcao de genero:" + outro);
				escolhi = true;
			} else {
				System.out.println("Digite apenas as siglas que demos: M, F ou O");
			}
		}
		
		entrada.close();
	}

}
