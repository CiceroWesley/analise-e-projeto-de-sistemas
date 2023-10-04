package empresaFacas;

public class Main {
	public static void main(String[] args) {
		FacaLoja loja;
		
		String opcao = "carne";
		
		if(opcao == "pao") {
			loja = new OrcamentoFacaPaoLoja();
		} else if(opcao == "chefe") {
			loja = new OrcamentoFacaChefeLoja();
		} else if(opcao == "carne") {
			loja = new OrcamentoFacaCarneLoja();
		} else {
			loja = null;
			System.out.println("Invalido");
		}
		
		loja.fazerPedido(opcao);
	}

}
