package controle;

public class Break {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				break; // interromper o laço mesmo que o for não tenha completado
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}
