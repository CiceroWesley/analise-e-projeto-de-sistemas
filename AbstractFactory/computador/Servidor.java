package computador;

public class Servidor extends Computador {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public Servidor(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
}
