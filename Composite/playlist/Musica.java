
public class Musica implements Componente{

	private String nomeMusica;
	private String artista;
	private float velocidadeReproducao = 1;
	
	public Musica(String nomeMusica, String artista) {
		this.nomeMusica = nomeMusica;
		this.artista = artista;
	}
	
	
	@Override
	public void tocar() {
		System.out.println("Tocando música:" + nomeMusica);
		
	}
	@Override
	public void setVelocidadeReproducao(float velocidade) {
		System.out.println("Alterando velocidade para: " + velocidade);
		this.velocidadeReproducao = velocidade;
	}
	@Override
	public String getNome() {
		return nomeMusica;

	}
	
	public String getArtista() {
		return artista;
	}
	
	//Construa seu c�digo aqui
	
	

}
