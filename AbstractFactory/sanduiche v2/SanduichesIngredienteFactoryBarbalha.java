
public class SanduichesIngredienteFactoryBarbalha implements  SanduichesIngredientFactory{
	private PaoIF pao;
	private PresuntoIF presunto;
	private SaladaIF salada;
	private QueijoIF queijo;
	
	public SanduichesIngredienteFactoryBarbalha() {
		pao = new PaoBola();
		queijo = new QueijoCheddar();
		presunto = new PresuntoDePeru();
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
