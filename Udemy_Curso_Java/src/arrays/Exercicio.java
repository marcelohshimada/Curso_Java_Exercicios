package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

//		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas do aluno"));
		
		double[] notasAluno1 = new double[4];
		System.out.println(Arrays.toString(notasAluno1));

			
		notasAluno1[0] = 7.9;
		notasAluno1[1] = 8;
		notasAluno1[2] = 6.7;
		notasAluno1[3] = 9;

		System.out.println(Arrays.toString(notasAluno1));
		System.out.println("\n" + notasAluno1[0]); // Imprime a primeira nota
		System.out.println(notasAluno1[notasAluno1.length - 1]); // Imprime a última nota
//		System.out.println(notasAluno1[4]); -> ERRO! Array possui 4 posições e tamanho 3 [3]

		double totalAluno1 = 0;
		for (int i = 0; i < notasAluno1.length; i++) {
			totalAluno1 += notasAluno1[i];
		}

		System.out.println("\nMédia Aluno 1 = " + totalAluno1 / notasAluno1.length);
		
		double[] notasAluno2 = { 6.9, 8.9, 5.5, 10 };
		
		double totalAluno2 = 0;
		for (int i = 0; i < notasAluno2.length; i++) {
			totalAluno2 += notasAluno2[i];
		}
		
		System.out.println("Média Aluno 2 = " + totalAluno2 / notasAluno2.length);
	}
	
}
