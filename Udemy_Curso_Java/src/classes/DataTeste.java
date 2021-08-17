package classes;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 10;
		d1.mes = 6;
		d1.ano = 1992;
		
		var d2 = new Data(); // var -> Inferência (Java identifica automaticamente o tipo de variável
		d2.dia = 17;
		d2.mes = 8;
		d2.ano = 2021;
		
//		System.out.printf("Nascimento: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
//		System.out.printf("Dia atual %d/%d/%d\n", d2.dia, d2.mes, d2.ano);
		
		System.out.println(d1.obterDataFormatada()); // Utilizando String.format
		System.out.println(d2.obterDataFormatada()); // Utilizando String.format
		
	}
}
