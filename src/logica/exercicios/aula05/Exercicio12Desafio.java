package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio12Desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com os lados");
		int ladoA = entrada.nextInt();
		int ladoB = entrada.nextInt();
		int ladoC = entrada.nextInt();
		
		System.out.printf("LadoA: %d \nLadoB: %d\nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		
		int x = 0;
		
		if(ladoA < ladoB) {
			x = ladoA;
			ladoA = ladoB;
			ladoB = x;
			System.out.printf("LadoA: %d \nLadoB: %d\nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		}
		
		
		if(ladoB < ladoC) {
			x = ladoB;
			ladoB = ladoC;
			ladoC = x;
			System.out.printf("LadoA: %d \nLadoB: %d\nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		}

		if(ladoA < ladoB) {
			x = ladoA;
			ladoA = ladoB;
			ladoB = x;
			System.out.printf("LadoA: %d \nLadoB: %d\nLadoC: %d \n\n");
		}
		if(ladoA >= (ladoB + ladoC)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			
			if((ladoA * ladoA) == (ladoB * ladoB)) //continuar
		}
	}

}
