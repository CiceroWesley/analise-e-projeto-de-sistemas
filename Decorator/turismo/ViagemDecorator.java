package turismo;

public abstract class ViagemDecorator extends Viagem{
    protected Viagem viagem;
    protected String descricao;
    protected Double preco;


    public ViagemDecorator(Viagem viagem, String descricao, Double preco){
        this.viagem = viagem;
        this.descricao = descricao;
        this.preco = preco;
    }

    public abstract String getDescricao();

    public abstract Double getPreco();

}
