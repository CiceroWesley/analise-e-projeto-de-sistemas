package lojaVirtual;

public class PromocaoNull implements PromocaoStrategy{
	private int desconto;

	public PromocaoNull(int desconto) {
		this.desconto = desconto;
		
	}
	
	
	@Override
	public Double calcularDesconto(Produto produto) {
		//como nao tem promocao, retornar o valor do proprio produto
		return produto.getPreco();
	}

}
