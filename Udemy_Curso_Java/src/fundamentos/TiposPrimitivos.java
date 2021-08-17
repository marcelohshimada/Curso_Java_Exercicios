package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informa��es do funcion�rio
		
		// tipos num�ricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // (1234845223) separa��o por meio de "_" para facilitar leitura
												// necess�rio colocar a letra "L" para indicar um n�mero do tipo Long
	
		// tipos num�ricos reais
		float salario = 11_445.44F; // "F" indica um n�mero do tipo float
		double vendasAcumuladas = 2_991_797_103.01; // 2991797109.01
		
		// tipo booleano
		boolean estaDeFerias = false; // false ou true
		
		// tipo caractere
		char status = 'A'; // por exemplo 'A' de Ativo
						   // char status = '\u0010 = tabela unicode
		
		// c�lculo de dias de empresa
		System.out.println("Dias de empresa = " + anosDeEmpresa * 365);
		
		// c�lculo de n�meros de viagens
		System.out.println("N�mero de viagens = " + numeroDeVoos/2);
		
		// pontos por real ganho
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Funcion�rio de f�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
