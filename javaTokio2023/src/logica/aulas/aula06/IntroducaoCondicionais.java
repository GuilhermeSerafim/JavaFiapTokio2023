package logica.aulas.aula06;

public class IntroducaoCondicionais {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL SIMPLES
		/*
		float nota = 5;
		if (nota < 6) {
			System.out.println("Sua nota é: " + nota);
		}
		*/
		
		//========================================================================
		/*
		float notaFinal = 5.9f;
		
		if(notaFinal < 6) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}*/
		
		//========================================================================
		//ESTRUTURA CONDICIONAL ENCADEADA
		//========================================================================
		
		float notaFinal = 10;
		
		if(notaFinal < 4) {
			System.out.println("Reprovado");
		} else {
			if(notaFinal < 6) {
				System.out.println("Recuperação");
				}
			} else {
				System.out.println("Aprovado");
			}
			
		}
	}

}
