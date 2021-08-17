package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		/* Infer�ncia vai inferir automaticamente o tipo da vari�vel
		 * Identificar se � um n�mero inteiro, decimal ou letra	
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
		
		double c; // declara��o de vari�vel
		c= 123; // inicializa��o da vari�vel
		System.out.println(c);
		
		var d = "variavel"; // para utilizar "var" � necess�rio declarar e inicializar 
		System.out.println(d);
		
		d = "outro teste";
		System.out.println(d);
	}
}
