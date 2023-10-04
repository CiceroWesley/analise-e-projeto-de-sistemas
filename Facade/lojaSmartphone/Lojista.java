package lojaSmartfone;

public class Lojista {
	private LojaCelular apple;
	private LojaCelular samsung;
	private LojaCelular xiaomi;
	
	public Lojista() {
		this.apple = new Apple("Iphone 13S", 5000.0, 50);
		this.samsung = new Samsung("Gran Duos",2500.0,20);
		this.xiaomi = new Xiaomi("Mi 8 lite",1280.80,20);
	}
	
	public void appleVenda() {
		this.apple = new Apple("Iphone 13S", 5000.0, apple.getQuantidadeEstoque() - 1);
		System.out.println("Aparelho vendido: "+ apple.getModelo()+ " por:" + apple.getPreco() + " Quantidade restante:" + apple.getQuantidadeEstoque());
	}
	
	public void samsungVenda() {
		this.samsung = new Samsung("Gran Duos",2500.0,samsung.getQuantidadeEstoque() - 1);
		System.out.println("Aparelho vendido: "+ samsung.getModelo()+ " por:" + samsung.getPreco() + " Quantidade restante:" + samsung.getQuantidadeEstoque());
	}
	
	public void xiaomiVenda() {
		this.xiaomi = new Xiaomi("Mi 8 lite",1280.80,xiaomi.getQuantidadeEstoque() - 1);
		System.out.println("Aparelho vendido: "+ xiaomi.getModelo()+ " por:" + xiaomi.getPreco() + " Quantidade restante:" + xiaomi.getQuantidadeEstoque());
	}

}
