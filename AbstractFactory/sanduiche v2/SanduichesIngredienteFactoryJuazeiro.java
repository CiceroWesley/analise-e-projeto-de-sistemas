
public class SanduichesIngredienteFactoryJuazeiro  implements  SanduichesIngredientFactory{
	private PaoIF pao;
	private PresuntoIF presunto;
	private SaladaIF salada;
	private QueijoIF queijo;
	
	public SanduichesIngredienteFactoryJuazeiro() {
		pao = new PaoIntegral();
		queijo = new QueijoPrato();
		presunto = new PresuntoDeFrango();
		salada = new SaladaSemVerdura();
	}
	
	
	@Override
    public void criarSanduiche() {
		pao.getPao();
		queijo.getQueijo();
		presunto.getPresunto();
		salada.getSalada();
    }
}
