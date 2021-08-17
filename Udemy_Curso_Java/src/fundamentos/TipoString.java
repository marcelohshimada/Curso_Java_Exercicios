package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2)); // o n�mero dentro do charAt vai imprimir o caractere na posi��o 2
		
		String s = "Boa tarde";
			s = s.toUpperCase();
		
		System.out.println(s.concat("!!!"));
			s = s.toLowerCase();
			System.out.println(s + "???");
		
		System.out.println(s.startsWith("Boa")); // verifica se inicia com "boa", se sim = true, se n�o, = false
		System.out.println(s.startsWith("boa")); // verifica se inicia com "boa", se sim = true, se n�o, = false
		
		System.out.println(s.toUpperCase().startsWith("boa")); // passa a palavra para LETRA MAI�SCULA e verifica se inicia com "boa", se sim = true, se n�o, = false
		
		System.out.println(s.length() + " caracteres"); // verifica e imprime a quantidade de caracteres da String
	
		System.out.println(s.toUpperCase().endsWith("tarde"));
		
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equals("BOA TARDE"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Marcelo";
		var sobrenome = "Shimada";
		var idade = 29;
		var salario = 12345.67;
		
		System.out.println("Nome: "+nome+ "\nSobrenome: "+sobrenome +"\nIdade: "+idade + "\nSal�rio: R$"+salario);
		System.out.printf("Nome: %s %s tem %d anos e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome: %s %s tem %d anos e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("ase")); // verifica se cont�m "ase" dentro da String
		System.out.println("Frase qualquer".indexOf("qual")); // verifica o �ndice (posi��o) da String "qual"
		System.out.println("Frase qualquer".substring(8)); // mostra a frase a partir do �ndice 8
		System.out.println("Frase qualquer".substring(6, 8)); // mostra a frase depois do �ndice 6 (n�o inclui) at� o �ndice 8 (inclui), intervalor de 2 a 4
		
	}
}
