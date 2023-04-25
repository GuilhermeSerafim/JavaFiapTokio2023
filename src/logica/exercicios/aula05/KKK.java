package logica.exercicios.aula05;

public class KKK {

	public static void main(String[] args) {
		String nome1 = "Alexandre";
		String nome2 = "Alexandre";
		String nome3 = new String("Alexandre");
		System.out.println(nome1 == nome2);
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equals(nome3));

	}

}
