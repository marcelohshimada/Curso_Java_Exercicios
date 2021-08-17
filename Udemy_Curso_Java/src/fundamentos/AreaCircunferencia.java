package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
//		final equivale a valor constante
		final double PI = 3.1415;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m²");
	}
}
