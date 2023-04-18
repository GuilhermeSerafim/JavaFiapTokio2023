package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean logicaE = true && true;
		System.out.println(logicaE);
		
		boolean verificaSenha = true;
		boolean verificaEmail = true;
		
		boolean LogicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		boolean logicaOu = true || false;
		System.out.println(logicaOu);
		
		boolean negacao = true != false;
		System.out.println(negacao);
		
		System.out.println(" ");
		
		//OPERADORES DE STRINGS
		
		String nome1 = "Joana";
		String nome2 = "Joanna";
		String nome3 = new String("Joana"); 
		System.out.println(nome1 == nome3); //variavel == objeto - false
		System.out.println(nome1.equals(nome3)); //está comparando os valores da variavel e o objeto.

	}

}
