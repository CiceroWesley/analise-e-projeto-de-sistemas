package computador;

public class Main {
	public static void main(String[] args) {
		
		ComputadorAbstractFactory fabricaPC = new PCFactory("16 GB", "500 GB", "2.4 GHz");
		ComputadorAbstractFactory fabricaServidor = new ServidorFactory("256 GB DDR4 ECC", "6x1TB micron 1100 (raid 6)", "Processador Intel (R) Xeon (R) CPU E5-2630 v4 - 3.10 GHz"); 
		
		Computador pc = ComputadorFactory.getComputador(fabricaPC);
		Computador servidor = ComputadorFactory.getComputador(fabricaServidor);
		
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+servidor);	
	}
}
