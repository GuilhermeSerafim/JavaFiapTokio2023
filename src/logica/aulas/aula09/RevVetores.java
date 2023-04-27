package logica.aulas.aula09;

public class RevVetores {

	public static void main(String[] args) {
		
		int[] numeros = {10, 20, 5, 3};
		
		for(int i = 0; i < numeros.length; i++) { //padrao - mais usado para manipular dados
			System.out.printf("Pos: %d -- Valor: %d\n", i, numeros[i]);
		}

		//UM FOR UM POQUINHO DIFERENTE.....
		//mais usado em data science
		for (int num: numeros) {
			if(num != 20) {
				System.out.println(num);
			}
		}
	}

}
