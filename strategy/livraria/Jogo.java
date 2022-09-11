package livraria;

public abstract class Jogo implements Artigo {
	protected String nome;
	protected double valor;
	protected int desconto;

	
	public abstract double calcularDesconto();
	
}
