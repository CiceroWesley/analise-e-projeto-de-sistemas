package lojaVirtual;

public class LojaContext {
	private PromocaoStrategy promocao;

	public void setPromocao(PromocaoStrategy promocao) {
		this.promocao = promocao;
	}
	
	public Double calcularPromocao(Produto produto) {
		return promocao.calcularDesconto(produto);
	}
	
}
