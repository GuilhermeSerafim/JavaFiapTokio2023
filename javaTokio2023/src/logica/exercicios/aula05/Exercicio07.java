package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float valorProduto = 10.50f;
		float valorPago = 20.00f;
		
		System.out.println("Seu troco: " + (valorPago - valorProduto) + "0$");

	}

}
