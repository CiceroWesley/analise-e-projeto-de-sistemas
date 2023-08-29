package estacao;

import java.util.ArrayList;

public class Estatisticas implements Observer,DisplayElement {
	
	
	private Double temperatura;
	private Double umidade;
	private Double pressao;
	protected Subject subject;
	
	public Estatisticas(Subject subject) {
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
		System.out.println("Media entre a temperatura, umidade e pressão é:");
		Double media = (this.temperatura+this.umidade+this.pressao)/3;
		System.out.println(media);
		if(media > 360.0) {
			System.out.println("Há 70% de chances de a temperatura, umidade e pressão subirem muito");
		} else {
			System.out.println("Não há 70% de chances de a temperatura, umidade e pressão subirem muito");
		}
		
	}

}
