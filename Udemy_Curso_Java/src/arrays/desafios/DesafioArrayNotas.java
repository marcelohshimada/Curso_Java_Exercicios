package arrays.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrayNotas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// Solicita informar a quantidade de notas a receber
		System.out.print("Digite a quantidade de notas: ");
		int qtdNotas = entrada.nextInt();

		// Array notas vai receber um tamanho qtdNotas de acordo com a entrada
		double[] notas = new double[qtdNotas];

		// Solicita informar cada nota
		for (int n = 0; n < notas.length; n++) {
			System.out.print("Informe a nota " + (n + 1) + ": ");
			notas[n] = entrada.nextDouble();
		}
		// Mostra array completo
		System.out.println(Arrays.toString(notas));
		
		// Variavel total inicia em 0 e vai somando a cada nota digitada
		double total = 0;
		
		// Estrutura Foreach , sendo nota -> variável e notas -> matriz
		for(double nota: notas) {
			// Variavel total vai somando a cada nota digitada
			total += nota;
		}
		
		// Media total de todas as notas informadas
		double media = total /notas.length;
		System.out.println("\nA média das notas é: "+ media);
		entrada.close();
	}
}
