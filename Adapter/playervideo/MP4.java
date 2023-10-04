package playervideo;

public class MP4 extends Video{

	@Override
	public void rodarVideo() {
		System.out.println("Rodando video em MP4");
		
	}

	@Override
	public void gravarVideoCam() {
		System.out.println("Gravando video da camera em MP4");
	}

}
