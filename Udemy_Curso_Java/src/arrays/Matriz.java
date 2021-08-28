package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita informar quantos alunos
		System.out.print("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();

		// Solicita informar quantas notas cada aluno vai ter
		System.out.print("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();

		// Matriz onde a primeira linha representa cada aluno e as colunas a quantidade
		// de notas
		// Matriz 3 x 2 --> 3 alunos com 2 notas cada um, total de 6 notas
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

		// Valor do total das notas inicia em 0
		double total = 0;

		for (int a = 0; a < notasDaTurma.length; a++) { // a = aluno -> linha
			for (int n = 0; n < notasDaTurma[a].length; n++) { // n = nota -> coluna

				System.out.printf("Informe a nota %d do aluno %d: ", (n + 1), (a + 1));
				notasDaTurma[a][n] = entrada.nextDouble();
				// A cada iteração soma o valor da nota da matriz completa na variável total
				total += notasDaTurma[a][n];
			}
		}

		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("\nMédia da tuma: " + media);

		// Estrutura Foreach para imprimir as notas de todos alunos dentros da matriz
		for (double[] notasDosAlunos: notasDaTurma) {
			System.out.println(Arrays.toString(notasDosAlunos));
		}

		entrada.close();
	}
}
