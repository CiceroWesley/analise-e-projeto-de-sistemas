package youtube;

import java.util.ArrayList;

public class Canal implements Subject {
	private ArrayList<Interessado> interessados;
	private String nomeCanal;
	private String status;
	
	Canal(String nomeCanal, String status){
		this.interessados = new ArrayList<Interessado>();
		this.nomeCanal = nomeCanal;
		this.status = status;
	}
	
	public String getNome() {
		return nomeCanal;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status == "live") {
			notificarInteressados();
		}
		
	}

	@Override
	public void registrarInteressados(Interessado interessado) {
		interessados.add(interessado);
		
	}

	@Override
	public void removerInteressados(Interessado interessado) {
		interessados.remove(interessado);
		
	}

	@Override
	public void notificarInteressados() {
		for(int i = 0; i < interessados.size(); i++) {
			interessados.get(i).update(this.status);
		}
		
	}
	

}
