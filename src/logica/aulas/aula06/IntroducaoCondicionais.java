package logica.aulas.aula06;

public class IntroducaoCondicionais {

	public static void main(String[] args) {

		// ========================================================================
		// ESTRUTURA CONDICIONAL SIMPLES E COMPOSTA
		// ========================================================================
		/*
		 * float nota = 5; if (nota < 6) { System.out.println("Sua nota é: " + nota); }
		 */

		// ========================================================================
		/*
		 * float notaFinal = 5.9f;
		 * 
		 * if(notaFinal < 6) { System.out.println("Reprovado"); } else {
		 * System.out.println("Aprovado"); }
		 */

		// ========================================================================
		// ESTRUTURA CONDICIONAL ENCADEADA
		// ========================================================================
		/*
		 * float notaFinal = 10; if (notaFinal < 4) { System.out.println("Reprovado"); }
		 * else { if (notaFinal < 6) { System.out.println("Recuperação"); } else {
		 * System.out.println("Aprovado"); } }
		 */

		// ========================================================================
		// ESTRUTURA CONDICIONAL COMPOSTA - ELSE IF
		// ========================================================================
		/*
		float notaFinal = 10;
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else if (notaFinal < 6) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Aprovado");
		}
		*/
		
		// ========================================================================
		// TABELA VERDADE
		// ========================================================================
		/*
		float notaFinal = 7;
		boolean prep1 = notaFinal >= 5; // true
		boolean prep2 = notaFinal < 7; // false
		boolean logicaE = prep1 && prep2; // false
		boolean logicaOu = prep1 || prep2; // true
		*/
	}

}
