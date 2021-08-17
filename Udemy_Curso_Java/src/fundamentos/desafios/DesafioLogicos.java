package fundamentos.desafios;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na ter�a-feira (V ou F)
		// Trabalho na quinta-feira (V ou F)
		// Confirma��o de 1 trabalho comprar de 1 TV 32"
		// Confirma��o de 2 trabalhos comprar de 1 TV 50"
		// Confirma��o qualquer compra de TV, levar a fam�lia p/ tomar sorvete
		// Se n�o houver trabalho, a fam�lia ficar� em casa s/ sorvete
		
		boolean trab1 = false;
		boolean trab2 = false;
		
		boolean tv50 = trab1 && trab2;
		boolean tv32 = trab1 ^ trab2;
		boolean sorvete = trab1 || trab2;
	
		// Operador un�rio
		boolean saudavel = !sorvete;
		
		System.out.println("Comprou TV 50\"? " +tv50);
		System.out.println("Comprou TV 32\"? " +tv32);
		System.out.println("Comprou sorvete? " +sorvete);
		System.out.println("Foi mais saud�vel? " +saudavel);
		
	}
}
