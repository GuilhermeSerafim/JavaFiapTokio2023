	package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos km voce correu com seu automovel?");
		int kPercorrido = entrada.nextInt();
		
		System.out.println("Quanto de combustivel o seu automovel consumiu?");
		int combusGasto = entrada.nextInt();
		
		int autonomia = kPercorrido / combusGasto;
		System.out.println(autonomia);
		if(autonomia < 8) {
			System.out.println("Autonomia legal");
		}else {
			System.out.println("Esse carro bebe em");
		}
		
		entrada.close();
	}

}
