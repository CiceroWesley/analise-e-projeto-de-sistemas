package estacao;

import java.util.ArrayList;

public class Previsao implements Observer,DisplayElement {
	
	protected Subject subject;
	private Double temperatura;
	private Double umidade;
	private Double pressao;
	
	public Previsao(Subject subject) {
		this.subject = subject;
		this.subject.registrarObservadores(this);
	}

	@Override
	public void atualizar() {
		ArrayList<Double> cond = new ArrayList<Double>();
		cond = subject.getEstado();
		this.temperatura = cond.get(0);
		this.umidade = cond.get(1);
		this.pressao = cond.get(2);
		this.exibir();
		
		
		
	}

	@Override
	public void exibir() {
		if(this.temperatura >= 30.0) {
			System.out.println("Como a temperatura está acima ou igual de 30 há chances de chuva para os proximos 15 dias");
		} else {
			System.out.println("Como a temperatura está abaixo de 30 não há chances de chuva para os proximos 15 dias");
		}
		
		if(this.umidade >= 50) {
			System.out.println("Como a umidade está acima ou igual de 50 há chances de chuva para os proximos 15 dias");
		} else {
			System.out.println("Como a umidade está abaixo de 50 não há chances de chuva para os proximos 15 dias");
		}
		
		if(this.pressao>= 1012) {
			System.out.println("Como a pressão está acima ou igual de 1012 há chances de chuva para os proximos 15 dias");
		} else {
			System.out.println("Como a pressão está abaixo de 1012 não há chances de chuva para os proximos 15 dias");
		}		
	}

}
