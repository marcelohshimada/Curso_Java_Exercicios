package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner salario = new Scanner (System.in);
		
		System.out.print("Digite o primeiro sal�rio ");
		String n1 = salario.nextLine().replace("," , ".");
		
		System.out.print("\nDigite o segundo sal�rio ");
		String n2 = salario.nextLine().replace("," , ".");
		
		System.out.print("\nDigite o terceiro sal�rio ");
		String n3 = salario.nextLine().replace("," , ".");
		
		System.out.printf("\nSal�rios informados: R$%s R$%s R$%s", n1,n2,n3);
		
		double s1 = Double.parseDouble(n1);
		double s2 = Double.parseDouble(n2);
		double s3 = Double.parseDouble(n3);
		double soma = s1+s2+s3;
		double media = soma / 3;

		System.out.println("\n\nA soma do sal�rios � R$" +soma);
		System.out.println("A m�dia do sal�rios � R$ " +media);
		
		salario.close();
				
	}

}
