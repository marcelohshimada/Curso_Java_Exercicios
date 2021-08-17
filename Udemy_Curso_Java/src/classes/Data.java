package classes;

public class Data {
	
	int dia, mes, ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
