package grife;

public class CoberturaMorangoDecorada extends BoloDecorator{

    public CoberturaMorangoDecorada(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao() + " Cobertura de Morango";
    }

    @Override
    public Double preco() {
        return bolo.preco() + 8;
    }
}
