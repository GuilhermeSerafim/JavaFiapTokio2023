package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio11Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o total de dias vividos:");
		int diasVividos = entrada.nextInt();
		int mesesVividos = diasVividos / 30;
		int anosVividos = diasVividos / 360;
		System.out.printf("Total de dias vividos: %d. Total de meses vividos: %d. Total de anos vividos: %d", diasVividos, mesesVividos, anosVividos);
		
		entrada.close();
	}

}
