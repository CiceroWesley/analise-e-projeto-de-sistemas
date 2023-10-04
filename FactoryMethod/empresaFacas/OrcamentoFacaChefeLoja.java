package empresaFacas;

public class OrcamentoFacaChefeLoja extends FacaLoja {

	@Override
	public Faca criarFaca() {
		return new FacaChefe();
	}


}
