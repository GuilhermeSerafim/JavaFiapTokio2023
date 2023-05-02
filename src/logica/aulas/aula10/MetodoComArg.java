package logica.aulas.aula10;

import java.util.Scanner;

public class MetodoComArg {
	
	// METODOS SEM RETORNO COM ARGUMENTOS/PARAMETROS
	
	static void saudacaoComArgs(String nome, int idade) {
		
		System.out.println(nome);
		System.out.println(idade);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nomeDigitada = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idadeDigitada = sc.nextInt();
		
		saudacaoComArgs(nomeDigitada, idadeDigitada);
		
		sc.close();

	}

}
