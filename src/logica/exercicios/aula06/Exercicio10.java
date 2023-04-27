package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o seu salario:");
		float salarioInicio = entrada.nextFloat(); //Salario antes do reajuste
		float aumento20 = salarioInicio * 0.20f; //percentual de aumento aplicado
		float aumento15 = salarioInicio * 0.15f; //e o valor do aumento
		float aumento10 = salarioInicio * 0.10f;
		float aumento5 = salarioInicio * 0.05f;
		float novoSalario;
		
		if(salarioInicio <= 280) {
			novoSalario = salarioInicio + aumento20;
			System.out.printf("Salario antes do reajuste: %.2f, valor de aumento: %.2f, novo salario: %.2f", salarioInicio, aumento20, novoSalario);
		} else if(salarioInicio >= 280 && salarioInicio < 700) {
			novoSalario = salarioInicio + aumento15;
			System.out.printf("Salario antes do reajuste: %.2f, valor de aumento: %.2f, novo salario: %.2f", salarioInicio, aumento15, novoSalario);
		} else if(salarioInicio >= 700 && salarioInicio < 1500) {
			novoSalario = salarioInicio + aumento10;
			System.out.printf("Salario antes do reajuste: %.2f, valor de aumento: %.2f, novo salario: %.2f", salarioInicio, aumento10, novoSalario);
		} else if(salarioInicio >= 1500) {
			novoSalario = salarioInicio + aumento5;
			System.out.printf("Salario antes do reajuste: %.2f, valor de aumento: %.2f, novo salario: %.2f", salarioInicio, aumento5, novoSalario);
		}
		entrada.close();

	}

}
