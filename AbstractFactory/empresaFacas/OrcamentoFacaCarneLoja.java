package empresaFacas;

public class OrcamentoFacaCarneLoja extends FacaLoja {

	@Override
	public Faca criarFaca() {
		return new FacaCarne();
	}


}
