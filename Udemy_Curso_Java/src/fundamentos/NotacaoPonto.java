package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X"; // String sempre com letra mai�scula
		s = s.replace("X", "Amigo");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "hideki"
				.toUpperCase();
				System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "galera")
				.toUpperCase();
		
		y = y
			.concat(" bora codar")
			.toLowerCase();
		
			System.out.println(y);
		
		y = y
			.replace("bora", "vamos")
			.toUpperCase()
			.concat("!!!");
		
			System.out.println(y);
	
			// tipos primitivos n�o tem o operador "." e funciona com String
			int a = 3;
			//a."alguma coisa" n�o existe
			System.out.println(a);
			
	}
}
