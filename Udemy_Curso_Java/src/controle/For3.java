package controle;

public class For3 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) { // <ctrl + shift + i> seleciona e verifica se a express�o � verdadeira
			for (int j = 0; j < 10; j++) { // pode-se utilizar o comando Watch > bot�o direito do mouse e procurar
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println(); // em debug -> "F8" navega para o pr�x breakpoint e imprime a linha inteira
		}
	}
}
