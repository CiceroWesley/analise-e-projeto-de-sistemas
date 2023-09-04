package turismo;

public class MassagemDecorada extends ViagemDecorator{

    public MassagemDecorada(Viagem viagem, String descricao, Double preco) {
        super(viagem, descricao, preco);
    }

    @Override
    public String getDescricao() {
        return viagem.getDescricao() + " Massagem:" + descricao;
    }

    @Override
    public Double getPreco() {
        return viagem.getPreco() + preco;
    }
}
