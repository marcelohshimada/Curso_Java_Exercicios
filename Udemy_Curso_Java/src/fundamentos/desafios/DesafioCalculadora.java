package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num 1
		// Ler num 2
		// Pedir para o usu�rio a opera��o a ser feita + - * / %
		// Realizar a opera��o entre os n�meros
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite o primeiro n�mero: ");
			double num1 = entrada.nextDouble();
		
			System.out.print("Digite o segundo n�mero: ");
			double num2 = entrada.nextDouble();
			
			System.out.print("\nDigite uma opera��o para c�lculo: ");
			String operacao = entrada.next();
			
			// L�gica
			double resultado = "+".equals(operacao) ? num1 + num2 : 0; // se digitar "+", faz a opera��o ap�s "?", caso negativo valor = 0
			resultado = "-".equals(operacao) ? num1 - num2 : resultado; // se digitar "-", faz a opera��o ap�s "?", salva na var resultado
			resultado = "*".equals(operacao) ? num1 * num2 : resultado;
			resultado = "/".equals(operacao) ? num1 / num2 : resultado;
			resultado = "%".equals(operacao) ? num1 % num2 : resultado;
			
			System.out.printf("\n%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		entrada.close();
		
		
		
	}
}
