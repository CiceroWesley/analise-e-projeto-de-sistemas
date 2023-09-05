
public class TestaMusica {

	//Voc� n�o precisa alterar o main
	public static void main(String[] args) {
		
		// Crie uma nova playlist vazia chamada "Foco no Estudo!" 
		Playlist estudando = new Playlist("Foco no Estudo!");		

		// Crie uma nova playlist chamada "Coding Mode" e adicione 2 musicas
		Playlist programando = new Playlist("Coding Mode");
		Musica programandoMusica1 = new Musica("Candles", "Jon Hopkins");
		Musica programandoMusica2 = new Musica("Day one", "Hans Zimmer");
		programando.add(programandoMusica1);
		programando.add(programandoMusica2);
		
		//Reproduzindo a playlist
		programando.tocar();

		System.out.println (" === O nome da playlist: " + programando.getNome() + " ===");
				
		

		/* Crie uma nova playlist chamada "Sol e Churrasco" e adicione 3 musicas 
		 entao configure a velocidade de reproducao para 0.5x */
		Playlist descansando = new Playlist("Sol e Churrasco");		
		Musica descansandoMusica1 = new Musica("Parada Louca", "Mari Fernandes");
		Musica descansandoMusica2 = new Musica("Arranh�o", "Henrique e Juliano");	
		Musica descansandoMusica3 = new Musica("Melhor eu ir", "Grupo menos � mais");
		descansando.add(descansandoMusica1);
		descansando.add(descansandoMusica2);
		descansando.add(descansandoMusica3);
		
		float velocidadeLenta = 0.5f;
		descansando.setVelocidadeReproducao(velocidadeLenta);

		//Reproduzindo a playlist
		descansando.tocar();

		System.out.println (" === O nome da playlist: " + descansando.getNome() + " ===");
		
		/* Crie uma nova música, configure a velocidade de repoducao em 1.25x
		 e toque a m�sica. 
		 O nome da m�sica para concentracao � "Makeshift Dream" e o artista 
		 desta m�sica � "Aron Edwards" */
		Musica concentracao = new Musica("Makeshift Dream", "Aron Edwards");
		float velocidadeRapida = 1.25f;
		concentracao.setVelocidadeReproducao(velocidadeRapida);
		concentracao.tocar(); 
		
		//Imprima as informa��es sobre a m�sica para concentra��o
		String nome = concentracao.getNome(); 
		String artista = concentracao.getArtista();
		System.out.println ("O nome da m�sica: " + nome );
		System.out.println ("O artista da m�sica: " + artista );

		// Adicione a m�sica para concentra��o na playlist "Foco no Estudo!" 
		estudando.add(concentracao);

		// Toque a playlist "Foco no Estudo!"
		estudando.tocar();

		// Exiba o nome da playlist que est� sendo reproduzida "Foco no Estudo!"
		System.out.println (" === O nome da playlist: " + estudando.getNome() + " ===");
		
	}
}
