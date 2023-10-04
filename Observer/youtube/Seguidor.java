package youtube;

public class Seguidor implements Interessado {
	private String nomeSeguidor; 
	private Subject subject;
	
	Seguidor(String nomeSeguidor, Subject subject){
		this.subject = subject;
		this.nomeSeguidor = nomeSeguidor;
		this.subject.registrarInteressados(this);
	}
	
	
	@Override
	public void update(String status) {
		System.out.println("Canal:" + this.subject.getNome());
		System.out.println("Novo status:" + status);
		this.play();
		
		
	}
	
	public void play() {
		System.out.println("Usuario:" + this.nomeSeguidor);
		System.out.println("Está assistindo a transmissão");
	}

}
