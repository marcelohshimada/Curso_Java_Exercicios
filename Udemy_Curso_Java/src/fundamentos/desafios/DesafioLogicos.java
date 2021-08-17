package fundamentos.desafios;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça-feira (V ou F)
		// Trabalho na quinta-feira (V ou F)
		// Confirmação de 1 trabalho comprar de 1 TV 32"
		// Confirmação de 2 trabalhos comprar de 1 TV 50"
		// Confirmação qualquer compra de TV, levar a família p/ tomar sorvete
		// Se não houver trabalho, a família ficará em casa s/ sorvete
		
		boolean trab1 = false;
		boolean trab2 = false;
		
		boolean tv50 = trab1 && trab2;
		boolean tv32 = trab1 ^ trab2;
		boolean sorvete = trab1 || trab2;
	
		// Operador unário
		boolean saudavel = !sorvete;
		
		System.out.println("Comprou TV 50\"? " +tv50);
		System.out.println("Comprou TV 32\"? " +tv32);
		System.out.println("Comprou sorvete? " +sorvete);
		System.out.println("Foi mais saudável? " +saudavel);
		
	}
}
