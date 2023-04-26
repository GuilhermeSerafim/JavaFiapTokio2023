package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano em que nasceu:");
		int idadeAno = entrada.nextInt();
		
		boolean dataCompleta = false;
		
		while(dataCompleta == false) {
			
			if(idadeAno >= 1800 && idadeAno <= 2030) {
				System.out.println("Digite o ano");
			}
			//continua... a logica aqui e voce colocar idademes e idadedia depois prosseguir
			else {
				System.out.println("Erro! Digite apenas a data em que você nasceu:");
			}
		}
	
	}

}	