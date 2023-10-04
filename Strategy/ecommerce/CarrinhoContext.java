package ecommerce;

import java.util.ArrayList;

public class CarrinhoContext {
	private PagamentoStrategy pagamento;
	private ArrayList<Produto> produtos;

	CarrinhoContext(){
		this.produtos = new ArrayList<Produto>();
	}

	public void setPagamento(PagamentoStrategy pagamento) {
		this.pagamento = pagamento;
	}
	
	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		this.produtos.remove(produto);
	}
	
	public void fecharCarrinho() {
		Double valorTotal = 0.0;
		System.out.println("Seu carrinho possui os seguintes itens:");
		for(Produto p : produtos) {
			System.out.println(p.getCodigoBarras());
		}
		
		for(Produto p : produtos) {
			valorTotal += p.getPreco();
		}
		
		System.out.println("O valor total é:" + valorTotal + " R$");
		pagamento.Pagar(valorTotal);
	}
}
