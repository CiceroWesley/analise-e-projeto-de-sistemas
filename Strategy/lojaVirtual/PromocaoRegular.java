package lojaVirtual;

public class PromocaoRegular implements PromocaoStrategy{
	private int desconto;
	
	
	public PromocaoRegular(int desconto) {
		this.desconto = desconto;
		
	}
	@Override
	public Double calcularDesconto(Produto produto) {
		Double desconto1 = produto.getPreco() * (this.desconto/100);
		return produto.getPreco() - desconto1;
	}

}
