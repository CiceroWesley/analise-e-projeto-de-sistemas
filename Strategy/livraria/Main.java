package livraria;

public class Main {

	public static void main(String[] args) {
		String opcao = "JogoVideoGameFisico";
		Livraria a1 = new Livraria();
		
		switch(opcao) {
			case "LivroImpresso":
				a1.setArtigo(new LivroImpresso("livro1",100,30));
				break;
			case "LivroDigital":
				a1.setArtigo(new LivroDigital("1984", 8.0,15));
				break;
			case "RevistaImpresso":
				a1.setArtigo(new RevistaImpresso("Caras",20.75,30));
				break;
			case "RevistaDigital":
				a1.setArtigo(new RevistaDigital("Epoca",15.5,15));
				break;
			case "JogoTabuleiro":
				a1.setArtigo(new JogoTabuleiro("Xadrez", 25, 30));
				break;
			case "JogoVideoGameFisico":
				a1.setArtigo(new JogoFisicoDigitalNullObject("RPG", 50.55, 0));
				break;
			case "JogoVideoGameDigital":
				a1.setArtigo(new JogoFisicoDigitalNullObject("Minecraft", 150, 0));
				break;
		}
		
		System.out.println(a1.calcularDesconto());
			
	}

}
