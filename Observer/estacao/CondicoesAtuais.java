package estacao;

import java.util.ArrayList;

public class CondicoesAtuais implements Observer, DisplayElement {
	
	private Double temperatura;
	private Double umidade;
	private Double pressao;
	protected Subject subject;
	
	public CondicoesAtuais(Subject subject) {
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
		System.out.println("As condições atuais são");
		System.out.println("Temperatura: " + this.temperatura);
		System.out.println("Umidade: " + this.umidade);
		System.out.println("Pressao: " + this.pressao);
		
	}

}
