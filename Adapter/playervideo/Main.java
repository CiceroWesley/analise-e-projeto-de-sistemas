package playervideo;

public class Main {
	public static void main(String[] args) {
		AVI videoAvi = new AVI();
		
		videoAvi.rodarVideo();

		SomVideoAdapter somMidAdaptadoVideo = new SomVideoAdapter(new Mid());
		somMidAdaptadoVideo.rodarVideo();
				

	}
}
