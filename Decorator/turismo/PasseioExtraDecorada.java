package turismo;

public class PasseioExtraDecorada extends ViagemDecorator{

    public PasseioExtraDecorada(Viagem viagem, String descricao, Double preco) {
        super(viagem, descricao, preco);
    }

    @Override
    public String getDescricao() {
        return viagem.getDescricao() + " Passeio:" + descricao;
    }

    @Override
    public Double getPreco() {
        return viagem.getPreco() + preco;
    }
}
