package lanchonete;

public class Main {
	public static void main(String[] args) {
		LanchoneteFactory lf = new LanchoneteFactory();
		Sanduiche sand = lf.criarSanduiche("crato");
		System.out.println(sand);
		sand.montarSanduiche();
		
	}
}
