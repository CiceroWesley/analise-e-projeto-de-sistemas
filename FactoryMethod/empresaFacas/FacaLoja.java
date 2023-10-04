package empresaFacas;

public abstract class FacaLoja {
	
	public FacaLoja() {
		
	}
	
	public abstract Faca criarFaca();
	
	public Faca fazerPedido(String tipoPedido) {
		Faca faca;
		if(tipoPedido == "carne") {
			 faca = criarFaca();
		} else if(tipoPedido == "pao") {
			 faca = criarFaca();
		} else if(tipoPedido == "chefe") {
			 faca = criarFaca();
		} else {
			 faca = null;
		}
		faca.amolar();
		faca.polir();
		faca.embalar();
		
		return faca;
	}

}
