package lanchonete;

public class LanchoneteFactory {
	
	public Sanduiche criarSanduiche(String tipo) {
		
		if(tipo == "juazeiro") {
			return new SanduicheJuazeiro();
		} else if(tipo == "crato") {
			return new SanduicheCrato();
		} else if(tipo == "barbalha") {
			return new SanduicheBarbalha();
		} else{
			return null;
		}
	}

}
