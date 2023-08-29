package estacao;

public class TestaEstacaoMeteorologica {
	public static void main(String[] args) {
		DadosMeteorologicos dados1 = new DadosMeteorologicos();
		CondicoesAtuais c1 = new CondicoesAtuais(dados1);
		Estatisticas e1 = new Estatisticas(dados1);
		Previsao p1 = new Previsao(dados1);
		dados1.configurarMedicoes(23.0,59.0,1013.0);
		dados1.configurarMedicoes(34.0,26.0,1011.0);
		dados1.configurarMedicoes(28.0,50.0,1015.0);
	}

}
