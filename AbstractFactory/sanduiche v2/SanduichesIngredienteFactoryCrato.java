
public class SanduichesIngredienteFactoryCrato implements  SanduichesIngredientFactory{
	private PaoIF pao;
	private PresuntoIF presunto;
	private SaladaIF salada;
	private QueijoIF queijo;
	
	public SanduichesIngredienteFactoryCrato() {
		pao = new PaoFrances();
		queijo = new QueijoMussarela();
		presunto = new PresuntoDeFrango();
		salada = new SaladaComVerdura();
	}
	
	
	@Override
    public void criarSanduiche() {
		pao.getPao();
		queijo.getQueijo();
		presunto.getPresunto();
		salada.getSalada();
    }
}
