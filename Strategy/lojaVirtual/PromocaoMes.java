package lojaVirtual;

public class PromocaoMes implements PromocaoStrategy{
	private int desconto;

	
	public PromocaoMes(int desconto) {
		this.desconto = desconto;
		
	}
	@Override
	public Double calcularDesconto(Produto produto) {
		//desconto entre 5% a 15%
		//colocar desconto maximo
		Double desconto1 = produto.getPreco() * (this.desconto/100);
		Double des = produto.getPreco() - (this.desconto/100);
		return des;
	}

}
