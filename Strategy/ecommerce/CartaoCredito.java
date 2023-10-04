package ecommerce;

public class CartaoCredito implements PagamentoStrategy {
	private String nomeTitular;
	private String numeroCartao;
	private long cvv;
	private String dataVencimento;
	
	CartaoCredito(String nomeTitular, String numeroCartao, long cvv, String dataVencimento){
		this.nomeTitular = nomeTitular;
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
		this.dataVencimento = dataVencimento;
	}

	@Override
	public void Pagar(Double valorTotal) {
		System.out.println("Valor:" + valorTotal + " pago no cartão de credito de número:" + this.numeroCartao);
		
	}

}
