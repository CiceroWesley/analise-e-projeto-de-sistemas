package livraria;

public abstract class Revista implements Artigo {
	protected String nome;
	protected double valor;
	protected int desconto;

	
	public abstract double calcularDesconto();
}

