package playervideo;

public class SomVideoAdapter implements VideoTarget{
	private Som som;
	
	public SomVideoAdapter(Som som) {
		this.som = som;
	}
	
	public void setSom(Som som) {
		this.som = som;
	}

	@Override
	public void rodarVideo() {
		som.rodarSom();
		
	}

	@Override
	public void gravarVideoCam() {
		som.gravarSom();
		
	}
	
	
}
