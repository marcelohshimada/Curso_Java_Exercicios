package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) { // enquanto for diferente de -1 continua perguntando
			System.out.print("Digite a nota (ou -1 para sair): ");
			nota = entrada.nextDouble();

			if (nota >= 0 && nota <= 10) { // nota precisa estar entre 0 e 10
				total += nota;
				quantNotas++;
			} else if (nota != -1) { 
				System.out.println("Nota inválida!");
			}
		}

		// Calcular a média

		double media = total / quantNotas;
		System.out.println("Média final = " + media);

		entrada.close();
	}
}
