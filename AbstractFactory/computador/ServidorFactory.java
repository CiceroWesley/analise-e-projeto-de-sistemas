package computador;

public class ServidorFactory implements ComputadorAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public ServidorFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public Computador createComputador() {
		return new Servidor(ram, hdd, cpu);
	}
}
