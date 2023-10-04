package ecommerce;

public class Produto {
	private String codigoBarras;
	private Double preco;
	
	Produto(String codigoBarras, Double preco){
		this.codigoBarras = codigoBarras;
		this.preco = preco;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public Double getPreco() {
		return preco;
	}

}
