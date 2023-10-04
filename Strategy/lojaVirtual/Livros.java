package lojaVirtual;

public class Livros extends Produto{
	public Livros(int sku, String descricao, double preco) {
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
