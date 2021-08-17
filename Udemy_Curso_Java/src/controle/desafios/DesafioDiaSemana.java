package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1
		// Segunda -> 2
		// Ter�a -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// S�bado -> 7

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do dia: ");

		String dia = entrada.next();

		if ("domingo".equalsIgnoreCase(dia)) { // nunca usar a compara��o de String por == / IgnoreCase para ignorar letras mai�sculas e min�sculas
			System.out.println("Dia da semana: 1");
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Dia da semana: 2");
		} else if (("ter�a".equalsIgnoreCase(dia)) || ("terca".equalsIgnoreCase(dia))) {
			System.out.println("Dia da semana: 3");
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Dia da semana: 4");
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Dia da semana: 5");
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Dia da semana: 6");
		} else if (("s�bado".equalsIgnoreCase(dia)) || ("sabado".equalsIgnoreCase(dia))) {
			System.out.println("Dia da semana: 7");
		} else {
			System.out.println("Dia Inv�lido!");
		}

		entrada.close();

	}
}
