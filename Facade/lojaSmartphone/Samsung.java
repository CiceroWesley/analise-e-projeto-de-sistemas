package lojaSmartfone;

public class Samsung implements LojaCelular {
	private String modelo;
	private Double preco;
	private long quantidadeEstoque;
	
	public Samsung(String modelo, Double preco, long quantidadeEstoque) {
		this.modelo = modelo;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	@Override
	public Double getPreco() {
		return preco;
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return modelo;
	}

	@Override
	public long getQuantidadeEstoque() {
		// TODO Auto-generated method stub
		return quantidadeEstoque;
	}

}
