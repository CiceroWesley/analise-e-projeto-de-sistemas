package lojaVirtual;

public class Brinquedos extends Produto{
	public Brinquedos(int sku, String descricao, double preco) {
		super(sku, descricao, preco);
		// TODO Auto-generated constructor stub
	}

	protected String nome;

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
