package youtube;

public interface Subject {
	public void registrarInteressados(Interessado interessado);
	public void removerInteressados(Interessado interessado);
	public void notificarInteressados();
	public String getNome();
}
