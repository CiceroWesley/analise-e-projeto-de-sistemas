package computador;

public abstract class Computador {
	
	public abstract String getRAM();
	public abstract String getHD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HD="+this.getHD()+", CPU="+this.getCPU();
	}
}
