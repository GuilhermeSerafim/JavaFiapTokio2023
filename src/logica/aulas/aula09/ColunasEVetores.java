package logica.aulas.aula09;

public class ColunasEVetores {

	public static void main(String[] args) {
	
		int[][] matriz = new int[4][5];
		
		int qtdLinhas = matriz.length;
		int qtdColunas = matriz[3].length;
		
		System.out.println("Linhas: " + qtdLinhas);
		System.out.println("Colunas: " + qtdColunas);
		//ATRIBUINDO
		for(int  i = 0; i < qtdLinhas; i++) {
			for(int j = 0; j < qtdColunas; j++) {
				matriz[i][j] = 5;
			}
		}
		//EXIBINDO - DA PARA COLOCAR O SYS OUT LA EMCIMA
		for(int  i = 0; i < qtdLinhas; i++) {
			for(int j = 0; j < qtdColunas; j++) {
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
