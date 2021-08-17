package classes;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;

		var p2 = new Produto(); //var -> Infer�ncia
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

//		double precoFinal1 = p1.preco * (1 - p1.desconto); sem m�todo
//		double precoFinal2 = p2.preco * (1 - p2.desconto); sem m�todo
		
		double precoFinal1 = p1.precoComDesconto(); // com m�todo
		double precoFinal2 = p2.precoComDesconto(); // com m�todo
		
		double mediaCompra = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("M�dia da compra R$%.2f", mediaCompra);

	}
}
