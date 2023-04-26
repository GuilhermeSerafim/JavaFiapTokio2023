package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digte a quantidade de produtos");
		int qtdProdutos = tec.nextInt();
		
		for (int i = 0; i < qtdProdutos; i++) {
			System.out.println("Produto " + (i + 1));
			
		tec.close();
			
		}
			
	}

}
