package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o codigo do seu estado:");
		float estado = Integer.parseInt(entrada.nextLine()); 
		
		System.out.println("Digite o peso da carga do caminhao em toneladas:");
		float pesoTonelada = entrada.nextFloat(); 
		
		System.out.println("Digite o codigo da carga de 10 a 40");
		int codigoCarga = entrada.nextInt();
	
		//CONVERSÃO
		float pesoKg = pesoTonelada * 1000.0f; 
		float precoPorKg;
		//IMPOSTO PELO ESTADO
		float estado1 = pesoKg * 0.35f;
		float estado2 = pesoKg * 0.25f;
		float estado3 = pesoKg * 0.15f;
		float estado4 = pesoKg * 0.05f;
		float estado5 = pesoKg * 0f;
		float valorTotal;
		//PARA SABER ESTADO
		if(estado == 1) {
			estado = estado1;
		} else if(estado == 2) {
			estado = estado2;
		} else if(estado == 3) {
			estado = estado3;
		} else if(estado == 4) {
			estado = estado4;
		} else if(estado == 5) {
			estado = estado5;
		}
		//PARA SABER CODIGO DA CARGA
		if(codigoCarga >= 10 && codigoCarga <= 20) {
				precoPorKg = pesoKg * 100.00f;
				valorTotal = precoPorKg + estado; //algo errado aqui
				System.out.printf("O valor total transportado pelo caminhao: R$" + valorTotal);
		} else if(codigoCarga >= 21 && codigoCarga <= 30) {
				precoPorKg = pesoKg * 250.00f;
				valorTotal = precoPorKg + estado;
				System.out.println("O valor total transportado pelo caminhao: R$" + valorTotal);
		} else if(codigoCarga >= 31 && codigoCarga <= 40) {
			precoPorKg = pesoKg * 340.00f;
			valorTotal = precoPorKg + estado;
			System.out.println("O valor total transportado pelo caminhao: R$" + valorTotal);
		}
		entrada.close();
	}

}
