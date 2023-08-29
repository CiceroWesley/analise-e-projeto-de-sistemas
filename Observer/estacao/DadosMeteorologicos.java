package estacao;

import java.util.ArrayList;

public class DadosMeteorologicos implements Subject{
	
	private ArrayList<Observer> observadores;
	private Double temperatura;
	private Double umidade;
	private Double pressao;
			
			
	public DadosMeteorologicos() {
		observadores = new ArrayList<Observer>();
	}


	@Override
	public void removerObservadores(Observer o1) {
		observadores.remove(o1);
		
	}

	public Double getTemperatura() {
		return temperatura;
	}


	public Double getUmidade() {
		return umidade;
	}


	public Double getPressao() {
		return pressao;
	}


	@Override
	public void notificarObservadores() {
		for(Observer o : observadores) {
			o.atualizar();
		}
		
	}

	@Override
	public void registrarObservadores(Observer o1) {
		observadores.add(o1);
		
	}
	
	public void configurarMedicoes(Double temp, Double umid, Double press) {
		this.temperatura = temp;
		this.umidade = umid;
		this.pressao = press;
		this.notificarObservadores();
	}


	@Override
	public ArrayList<Double> getEstado() {
		ArrayList<Double> cond = new ArrayList<Double>();
		cond.add(getTemperatura());
		cond.add(getUmidade());
		cond.add(getPressao());
		return cond;
	}

}
