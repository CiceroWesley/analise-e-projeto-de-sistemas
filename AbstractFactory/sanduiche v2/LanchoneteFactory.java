

public class LanchoneteFactory {
	//aqui seria a application
	private SanduichesIngredientFactory fabrica;


	public LanchoneteFactory(SanduichesIngredientFactory fabrica){
		this.fabrica = fabrica;
	}
	public void criarSanduiche() {
		fabrica.criarSanduiche();
	}

}
