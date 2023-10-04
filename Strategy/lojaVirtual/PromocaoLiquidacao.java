package lojaVirtual;

public class PromocaoLiquidacao implements PromocaoStrategy{
	private int desconto;

	
	public PromocaoLiquidacao(int desconto) {
		this.desconto = desconto;
		
	}
	
	@Override
	public Double calcularDesconto(Produto produto) {
		//desconto entre 5% a 15%
		//colocar desconto maximo
		Double desconto1 = produto.getPreco() * (this.desconto/100);
		return produto.getPreco() - desconto1;
	}

}
