package patoperu;

public class Main {
	public static void main(String[] args) {
		Peru perugulugulu = new Peru();
		
		PeruPatoAdapter ppa = new PeruPatoAdapter();
		Pato patolino = new PatoNegro();
		
		ppa.grasnar();
		ppa.voar();
		
		patolino.grasnar();
		patolino.voar();
		
		
	}
}
