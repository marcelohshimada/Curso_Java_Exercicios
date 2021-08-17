package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informações do funcionário
		
		// tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // (1234845223) separação por meio de "_" para facilitar leitura
												// necessário colocar a letra "L" para indicar um número do tipo Long
	
		// tipos numéricos reais
		float salario = 11_445.44F; // "F" indica um número do tipo float
		double vendasAcumuladas = 2_991_797_103.01; // 2991797109.01
		
		// tipo booleano
		boolean estaDeFerias = false; // false ou true
		
		// tipo caractere
		char status = 'A'; // por exemplo 'A' de Ativo
						   // char status = '\u0010 = tabela unicode
		
		// cálculo de dias de empresa
		System.out.println("Dias de empresa = " + anosDeEmpresa * 365);
		
		// cálculo de números de viagens
		System.out.println("Número de viagens = " + numeroDeVoos/2);
		
		// pontos por real ganho
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Funcionário de férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
