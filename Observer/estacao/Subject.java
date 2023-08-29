package estacao;

import java.util.ArrayList;

public interface Subject {

	public void registrarObservadores(Observer o1);
	
	public void removerObservadores(Observer o1);
	
	public void notificarObservadores();
	
	public ArrayList<Double> getEstado();
}
