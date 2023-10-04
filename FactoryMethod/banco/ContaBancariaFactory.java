package banco;

public class ContaBancariaFactory {
	
	
	public ContaBancaria criarConta(String tipo) {
		
		if(tipo == "poupanca") {
			return new ContaPoupanca();
		} else if(tipo == "corrente") {
			return new ContaCorrente();
		} else if(tipo == "juridica") {
			return new ContaJuridica();
		} else {
			return null;
		}
		
	}

}
