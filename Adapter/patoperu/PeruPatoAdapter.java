package patoperu;

public class PeruPatoAdapter extends Peru implements Pato {
	
	public PeruPatoAdapter() {
	}
	
	@Override
	public void voar() {
		baterAsas();		
		
	}

	@Override
	public void grasnar() {
		wooble();
		
	}

}
