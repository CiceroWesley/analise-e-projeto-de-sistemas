package ecommerce;

public class Main {
	public static void main(String[] args) {
		CarrinhoContext carrinho = new CarrinhoContext();
		Produto arroz = new Produto("343434", 6.50);
		Produto feijao = new Produto("89594", 5.40);
		Produto fava = new Produto("967842", 7.30);
		
		carrinho.adicionarProduto(fava);
		carrinho.adicionarProduto(feijao);
		carrinho.adicionarProduto(arroz);
		
		
		//escolha a forma de pagamento, 1 para cartão e 2 para paypal
		long pagamento = 1;
		if(pagamento ==  1) {
			carrinho.setPagamento(new CartaoCredito("Cicero Wesley", "123456", 123, "21102024"));
		} else if(pagamento == 2) {
			carrinho.setPagamento(new PayPal("wesleycariutaba@gmail.com", "123456"));
		}
		
		carrinho.fecharCarrinho();
		 
		
		
		
		
	}

}
