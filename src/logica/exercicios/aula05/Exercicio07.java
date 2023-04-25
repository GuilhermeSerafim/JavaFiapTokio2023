package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor do produto: ");
		float valProduto = entrada.nextFloat();
		
		System.out.println("Entre com o valor a ser pago: ");
		float valPago = entrada.nextFloat();
		
		float troco = valPago - valProduto; 
		System.out.println("Seu troco: " + troco);
		
		entrada.close();
	}

}
