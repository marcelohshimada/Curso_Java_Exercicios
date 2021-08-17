package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1
		// Segunda -> 2
		// Terça -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// Sábado -> 7

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do dia: ");

		String dia = entrada.next();

		if ("domingo".equalsIgnoreCase(dia)) { // nunca usar a comparação de String por == / IgnoreCase para ignorar letras maiúsculas e minúsculas
			System.out.println("Dia da semana: 1");
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Dia da semana: 2");
		} else if (("terça".equalsIgnoreCase(dia)) || ("terca".equalsIgnoreCase(dia))) {
			System.out.println("Dia da semana: 3");
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Dia da semana: 4");
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Dia da semana: 5");
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Dia da semana: 6");
		} else if (("sábado".equalsIgnoreCase(dia)) || ("sabado".equalsIgnoreCase(dia))) {
			System.out.println("Dia da semana: 7");
		} else {
			System.out.println("Dia Inválido!");
		}

		entrada.close();

	}
}
