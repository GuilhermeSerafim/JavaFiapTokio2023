package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {

		String[] listaFrutas = new String[4];
		
//		listaFrutas[0] = "Kiwi";
//		listaFrutas[1] = "Jabuticaba";
//		listaFrutas[2] = "Maracuja doce";
//		listaFrutas[3] = "Pitaia";
		
//		System.out.println("Fruta posicao 1: " + listaFrutas[1]);
		
//		String[] listaFrutas2 = {"Manga", "Jaca", "Tangerina", "Pitomba"};
		
//		int qtdFrutas = listaFrutas.length;
//		System.out.println(qtdFrutas);
		
//		for(int i = 0; i < qtdFrutas; i++) {
//			System.out.println(listaFrutas2[i]); //se eu digitar 1, ele vai exibir somente a fruta Jaca
//		}
			int[] numeros = {0, 5, 20, 30};
			
			//FOR INDEXADO
			
			for(int i = 0; i < numeros.length; i++) {
				System.out.printf("Pos: %d -- Valor: %d \n", i, numeros[i]);
		}
	}

}
