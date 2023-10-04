package computador;

public class ComputadorFactory {
	
	public static Computador getComputador(ComputadorAbstractFactory factory) {
		return factory.createComputador();
	}
}
