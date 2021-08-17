package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		/* Inferência vai inferir automaticamente o tipo da variável
		 * Identificar se é um número inteiro, decimal ou letra	
		 */
		var a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		var b = "texto";
		System.out.println(b);
		
		b = "outro texto";
		System.out.println(b);
		
		b = "teste";
		System.out.println(b);
		
		double c; // declaração de variável
		c= 123; // inicialização da variável
		System.out.println(c);
		
		var d = "variavel"; // para utilizar "var" é necessário declarar e inicializar 
		System.out.println(d);
		
		d = "outro teste";
		System.out.println(d);
	}
}
