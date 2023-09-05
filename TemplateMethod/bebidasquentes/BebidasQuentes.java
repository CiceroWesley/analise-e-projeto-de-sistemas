package bebidasquentes;

public abstract class BebidasQuentes {
	final void prepararReceita() { //metodo template
		Ferver();
		prepararInfusao();
		Servir();
		if(clienteQuerCondimento()) {
			adicionarCondimentos();
		}
		
	}
	public void Ferver() {
		System.out.println("Fervendo.");
	}
	
	public void Servir() {
		System.out.println("Servindo.");

	}
	
	public boolean clienteQuerCondimento() {
		String resposta = "s"; //resposta do usuário, usar 
		if(resposta.toLowerCase().startsWith("s")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public abstract void prepararInfusao(); //hook method
	public abstract void adicionarCondimentos(); //hook method
}
