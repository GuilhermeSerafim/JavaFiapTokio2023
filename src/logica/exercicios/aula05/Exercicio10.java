package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero do ano em que voce nasceu:");
		int idadeAno = entrada.nextInt();
		System.out.println("Digite o numero do mes em que voce nasceu:");
		int idadeMes = entrada.nextInt();
		System.out.println("Digite o dia do mes em que voce nasceu:");
		int idadeDia = entrada.nextInt();
		
		int diasVividosAno = (2023 - idadeAno) * 360;
		int diasVividosMes = idadeMes * 30;
		int diasVividos = idadeDia;
		int totalDiasVividos = diasVividosAno + diasVividosMes + diasVividos;
		
		boolean dataCompleta = false;
		
		while(dataCompleta == false) {
			
			if(idadeAno >= 1800 && idadeAno <= 2023) {
				if(idadeMes >= 1 && idadeMes <= 12) {
					if(idadeDia >= 1 && idadeDia <= 31) {
						System.out.println("Total de dias vividos: " + totalDiasVividos);
						dataCompleta = true;
					}
					
				}
			}
			else {
				System.out.println("Erro! Digite apenas a data em que você nasceu:");
				//else não funciona
			}
		}
		entrada.close();
	}

}	