package empresaFacas;

public class OrcamentoFacaPaoLoja extends FacaLoja {

	@Override
	public Faca criarFaca() {
		return new FacaPao();
	}


}
