package banco;

public class Main {
	public static void main(String[] args) {
		ContaBancariaFactory cbf = new ContaBancariaFactory();
		ContaBancaria conta = cbf.criarConta("poupanca");
		System.out.println(conta);
		conta.registrarConta();
	
	}

}
