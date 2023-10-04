
public class Main {
	public static void main(String[] args) {
		SanduichesIngredientFactory factory;
		String opcao = "crato";

		if(opcao == "crato"){
			factory = new SanduichesIngredienteFactoryCrato();
		} else if(opcao == "juazeiro"){
			factory = new SanduichesIngredienteFactoryJuazeiro();
		} else if(opcao == "barbalha"){
			factory = new SanduichesIngredienteFactoryBarbalha();
		} else{
			factory = null;
		}

		 //a lanchonetefactory seria a application do guru
		 LanchoneteFactory lf = new LanchoneteFactory(factory);
		 lf.criarSanduiche();
		
	}
}
