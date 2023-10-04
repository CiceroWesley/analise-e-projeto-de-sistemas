package lojaVirtual;

public abstract class Produto {
	protected int sku;
	protected String descricao;
	protected double preco;
	
	public Produto(int sku, String descricao, double preco) {
		this.sku = sku;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
