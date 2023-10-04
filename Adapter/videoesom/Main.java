package videoesom;

public class Main {
	public static void main(String[] args) {
		AVI videoAVI = new AVI();
		videoAVI.reproduzirVideo();
		
		Adapter obj1 = new Adapter(new MIDI());
		obj1.reproduzirVideo();
	}
}
