package computador;

public class PCFactory implements ComputadorAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public Computador createComputador() {
		return new PC(ram, hdd, cpu);
	}
}
