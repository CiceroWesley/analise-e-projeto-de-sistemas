package turismo;

public abstract class Viagem {
    protected String descricao;
    protected Double preco;

    public String getDescricao() {
        return "Destino:" +descricao + " com";
    }
    public abstract Double getPreco();
}
