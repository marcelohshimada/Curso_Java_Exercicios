package controle.desafios;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
// Desafio -> não utilizar valor numérico para controlar o laço
		
		System.out.println("Desafio!\n");
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
