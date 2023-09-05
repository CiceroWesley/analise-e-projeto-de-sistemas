
import java.util.ArrayList;

public class Playlist implements Componente {

	private String nomePlayList;
	private ArrayList<Componente> playlists;
	
	public Playlist(String nomePlayList) {
		this.nomePlayList = nomePlayList;
		this.playlists = new ArrayList<Componente>();
	}
	
	@Override
	public void tocar() {
		//System.out.println("Tocando playlist:" + nomePlayList);
		for(int i = 0; i < playlists.size();i++) {
			playlists.get(i).tocar();
		}
		
	}
	@Override
	public void setVelocidadeReproducao(float velocidade) {
		//altera a velocidade para cada música individualmente.
		for(int i =0; i< playlists.size(); i++) {
			playlists.get(i).setVelocidadeReproducao(velocidade);
		}
	}
	@Override
	public String getNome() {
		return nomePlayList;
	}
	
	public void add(Componente componente) {
		System.out.println("Adicionado com sucesso a playlist " + nomePlayList);
		playlists.add(componente);
	}
	
	public void remover(Componente componente) {
		playlists.remove(componente);
	}
	
	//Construa seu c�digo aqui
	

}
