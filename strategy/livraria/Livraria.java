package livraria;

public class Livraria {
	private Artigo artigo;
	
	public void setArtigo(Artigo artigo){
		this.artigo = artigo;
	}
	
	public double calcularDesconto() {
		System.out.println("Em livraria");
		return artigo.calcularDesconto();	
	}
}
