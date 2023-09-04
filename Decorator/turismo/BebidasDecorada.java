package turismo;

public class BebidasDecorada extends ViagemDecorator{

    public BebidasDecorada(Viagem viagem, String descricao, Double preco) {
        super(viagem, descricao, preco);
    }

    @Override
    public String getDescricao() {
        return viagem.getDescricao() + " Bebida:" + descricao;
    }

    @Override
    public Double getPreco() {
        return viagem.getPreco() + preco;
    }
}
