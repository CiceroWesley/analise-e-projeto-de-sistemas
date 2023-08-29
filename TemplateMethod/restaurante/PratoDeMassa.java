
public abstract class PratoDeMassa {
	final void fazerReceitaTemplate() {
		ferverAgua();
		cozinharMassa();
		escorrerMassa();
		colocarNoPrato();
		adicionarMassa();
		adicionarMolho();
		adicionarProteina();
		adicionarEnfeite();
	}

	public void ferverAgua() {
		System.out.println("Fervendo água");
	}
	
	public void cozinharMassa() {
		System.out.println("Cozinhando massa");
	}
	
	public void escorrerMassa() {
		System.out.println("Escorrendo massa");
	}
	
	public void colocarNoPrato() {
		System.out.println("Colocando no prato");
	}
	
	public abstract void adicionarMassa();
	
	public abstract void adicionarMolho();
	
	public abstract void adicionarProteina();
	
	
	public abstract void adicionarEnfeite();
}
