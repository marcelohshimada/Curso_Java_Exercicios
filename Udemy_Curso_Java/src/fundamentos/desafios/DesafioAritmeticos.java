package fundamentos.desafios;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
	int a = 3 * 4 - 10;
	int b = (int) Math.pow(a, 3);
	double c = Math.pow(a, 3);
	
	System.out.println(b);
	System.out.println(c);
	
	// desafio aritmético
	
	double p1 = 3 + 2;
	double p2 = 6 * p1;
	double p3 = Math.pow(p2, 2);
	double p4 = 3 * 2;
	double p5 = p3 / p4;
	
	double p6 = 1 - 5;
	double p7 = 2 - 7;
	double p8 = p6 * p7;
	double p9 = p8 / 2;
	double p10 = Math.pow(p9, 2);
	
	double p11 = p5 - p10;
	double p12 = Math.pow(p11, 3);
	
	double p13 = Math.pow(10, 3);
	double resultado = p12 / p13;
	
	System.out.println("Resultado do desafio = "+resultado);
	
	}
}
