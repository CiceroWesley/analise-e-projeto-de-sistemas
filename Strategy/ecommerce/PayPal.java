package ecommerce;

public class PayPal implements PagamentoStrategy {
	private String email;
	private String senhaUsuario;
	
	
	PayPal(String email, String senhaUsuario){
		this.email = email;
		this.senhaUsuario = senhaUsuario;
	}

	@Override
	public void Pagar(Double valorTotal) {
		System.out.println("Valor:" + valorTotal + " pago no PayPal de email:" + this.email);
		
	}

}
