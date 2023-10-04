package youtube;

public class Main {
	public static void main(String[] args) {
		Canal c1 = new Canal("Coisa de Nerd","video");
		Interessado wesley = new Seguidor("Wesley", c1);
		Interessado suares = new Seguidor( "Suares", c1);
		Canal c2 = new Canal("Cade a Chave", "video");
		
		Interessado cicero = new Seguidor("Cicero", c2);
		Interessado feitosa = new Seguidor("Feitosa", c2);
		
		c1.setStatus("video");
		//os seguidores so são notificados quando é apenas live
		c1.setStatus("live");
		
		c2.setStatus("live");
		
		c1.removerInteressados(suares);
		
		c1.setStatus("video");
		c1.setStatus("live");
		
		
	}

}
