package controle;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue; // interrompe apenas a itera��o, mas volta para o in�cio do la�o
			}

			System.out.println(i);
		}

			System.out.println();
			
		for (int i = 1; i <= 10; i++) {
			if (i == 5) // imprime todos menos o n�mero 5
				continue; 
			System.out.println(i);
		}
	}
}
