package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int A = entrada.nextInt();
		System.out.println("Digite o segundo valor:");
		int B = entrada.nextInt();
		
		if(A % B == 0){
			System.out.println("Eles sao multiplos");
		}else {
			System.out.println("Nao sao multiplos");
		}
		
		entrada.close();

	}

}
