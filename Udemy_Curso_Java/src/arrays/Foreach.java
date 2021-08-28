package arrays;

import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
//		Método convencional
		
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println(notas[i] + "");
//		}
//		System.out.println(Arrays.toString(notas) + "\n");
		
		// Método Foreach
		
		for (double nota: notas) { // nota é a variável e notas é a matriz
			System.out.println(nota);
		}
		System.out.println(Arrays.toString(notas));
	}
}