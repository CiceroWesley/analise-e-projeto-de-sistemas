package videoesom;

public class Adapter implements VideoTarget {
	private Som som;
	
	
	public Adapter(Som som) {
		this.som = som;
	}
	
	public void setSom(Som som) {
		this.som = som;
	}
	
	
	@Override
	public void reproduzirVideo() {
		// TODO Auto-generated method stub
		this.som.reproduzirSom();
		
	}

	@Override
	public void gravarVideoWebcam() {
		// TODO Auto-generated method stub
		this.som.gravarSom();
		
	}

}
