package livraria;

public class RevistaImpresso extends Revista {
	public RevistaImpresso(String nome, double valor, int desconto){
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
	}
	
	@Override
	public double calcularDesconto() {
		double desconto = (this.desconto * this.valor)/100;
		desconto = this.valor - desconto;
		return desconto;
	}
}