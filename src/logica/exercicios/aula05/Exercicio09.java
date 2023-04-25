package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o numero: ");
		int num = entrada.nextInt();
		if(num > 0 && num < 999) {
			
			//Pegando unidade
			int unidade = num % 10;
			//Eliminando a unidade
			num = num / 10;
			//Pegando a dezena
			int dezena = num % 10;
			//Eliminando a dezena
			num = num / 10;
			// Pegando a centena
		    int centena = num % 10;
		  //Exibindo resultado na tela
		    System.out.printf("\nUnidade = %d\nDezena = %d\nCentena = %d\n", unidade, dezena, centena);
		}

	}

}
