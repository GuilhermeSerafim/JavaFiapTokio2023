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
		
		//PARA SABER O IMPOSTO PELO ESTADO
		if(estado == 1) {
			estado = pesoKg * 0.35f;
		} else if(estado == 2) {
			estado = pesoKg * 0.25f;
		} else if(estado == 3) {
			estado = pesoKg * 0.15f;
		} else if(estado == 4) {
			estado = pesoKg * 0.05f;
		} else if(estado == 5) {
			estado = pesoKg;
		}
		
		//PARA SABER CODIGO DA CARGA E O PRECO DA CARGA DO CAMINHAO - TOTAL(carga + impostos)
		float valorTotal;
		
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
