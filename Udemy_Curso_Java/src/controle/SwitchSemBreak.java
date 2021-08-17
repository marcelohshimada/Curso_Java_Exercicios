package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		// if(boolean) ...
		// while(boolean)...
		// for(;boolean;)

		String faixa = "vermelha";

		switch (faixa.toLowerCase()) { // sem o break o programa executa todos abaixo do selecionado

		case "preta":
			System.out.println("Sei o Bassa-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei de nada");
		}

		System.out.println("Fim");
	}
}
