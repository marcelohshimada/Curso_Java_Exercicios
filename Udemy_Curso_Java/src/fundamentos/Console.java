package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom ");
		System.out.print("dia!");
		
		System.out.printf("\nMegasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6); //%n também pula linha
		System.out.printf("Salário: R$ %.2f %n", 12345.5678);
		System.out.printf("Nome: %s %n", "Paulo");
		
		Scanner entrada = new Scanner(System.in); // Scannear as entradas
		
		System.out.print("Digite o seu nome: ");;
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");;
		String sobrenome = entrada.nextLine();

		System.out.print("Digite a sua idade: ");;
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. %n", nome , sobrenome, idade);
		
		entrada.close(); // ao para de usar o Scanner, deve-se usar o comando para fechar -> entrada.close()
			
		
	}
}
