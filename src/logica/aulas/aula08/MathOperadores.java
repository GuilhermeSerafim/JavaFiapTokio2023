package logica.aulas.aula08;

public class MathOperadores {

	public static void main(String[] args) {
		
		double PI = Math.PI;
		System.out.println(PI);
		
		System.out.println(Math.sqrt(225));
		
		System.out.println(Math.abs(-25));
		
		double num = 3.6;
		
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.round(num));
		
		//--------------------------------------------------------------------------------
		
		double random = Math.random();
		System.out.println(random);
		
		double multiplica = random * 5;
		System.out.println(multiplica);
		
		double min = 5;
		double max = 10;
		
		double intervalo = min + random;
		
		System.out.println("Intervalo: " + intervalo);

	}

}
