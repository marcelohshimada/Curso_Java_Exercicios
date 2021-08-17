package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num 1
		// Ler num 2
		// Pedir para o usuário a operação a ser feita + - * / %
		// Realizar a operação entre os números
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite o primeiro número: ");
			double num1 = entrada.nextDouble();
		
			System.out.print("Digite o segundo número: ");
			double num2 = entrada.nextDouble();
			
			System.out.print("\nDigite uma operação para cálculo: ");
			String operacao = entrada.next();
			
			// Lógica
			double resultado = "+".equals(operacao) ? num1 + num2 : 0; // se digitar "+", faz a operação após "?", caso negativo valor = 0
			resultado = "-".equals(operacao) ? num1 - num2 : resultado; // se digitar "-", faz a operação após "?", salva na var resultado
			resultado = "*".equals(operacao) ? num1 * num2 : resultado;
			resultado = "/".equals(operacao) ? num1 / num2 : resultado;
			resultado = "%".equals(operacao) ? num1 % num2 : resultado;
			
			System.out.printf("\n%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		entrada.close();
		
		
		
	}
}
