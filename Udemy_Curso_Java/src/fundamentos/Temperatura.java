package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		int fahrenheit;
		double celsius;
		final int constante = 32;
		final double multiplicador = 5.0/9.0;
		
		fahrenheit = 86;
		celsius = (fahrenheit - constante) * multiplicador;
		System.out.println("A temperatura convertida é " + celsius + "°C");

		fahrenheit = 0;
		celsius = (fahrenheit - constante) * multiplicador;
		System.out.println("A temperatura convertida é " + celsius + "°C");
		
	}
}