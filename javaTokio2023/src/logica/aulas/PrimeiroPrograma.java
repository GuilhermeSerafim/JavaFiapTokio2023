package logica.aulas;

public class PrimeiroPrograma { //classe é colocado sempre com letra maiúscula

	public static void main(String[] args) { /*main é uma função, mas quando uma função
	está dentro de uma classe, ela vira um método*/
		
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		int idade;
		idade = 23;
		
		System.out.println(idade);
		
		idade = 42;
		System.out.println(idade);
		
		double salario = 1318.20;
		System.out.println(salario);
		
		String nome = "João";					//é uma classe
		System.out.println(nome + " olá");
		
		System.out.println("Bem-vindo, " + nome + "!");
		System.out.println(nome + ", o dobro da sua idade é: " + (idade + idade));
		
		
	}

}
