package lojaVirtual;

public class Main {
	public static void main(String[] args) {
		//janeiro fevereiro março abril setebro novembro
		//maio junho agosto outubro dezembro com desconto
		String pagamento = "Avista";
		boolean liquidacao = false;
		int mesOp = 5;
		int[] mesD = {5,6,8,9,10};
		LojaContext loja = new LojaContext();
		double preco = 0;
		
		Livros livro1 = new Livros(1,"teste",10);
		
		for(int i=0; i< mesD.length ; i++) {
			if(mesOp == mesD[i] && !liquidacao) {
				loja.setPromocao(new PromocaoMes(15));
				preco = loja.calcularPromocao(livro1);
				if(pagamento =="Avista") {
					loja.setPromocao(new PromocaoRegular(5));
					preco = loja.calcularPromocao(livro1);
				}
			} else {
				loja.setPromocao(new PromocaoNull(0));
				preco = loja.calcularPromocao(livro1);
			}
		}
		
		if(liquidacao) {
			loja.setPromocao(new PromocaoLiquidacao(30));
			preco = loja.calcularPromocao(livro1);
		}
		
		
		System.out.println("Preco depois dos descontos" + preco);
		
	}

}
