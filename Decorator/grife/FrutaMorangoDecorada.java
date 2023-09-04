package grife;

public class FrutaMorangoDecorada extends BoloDecorator{

    public FrutaMorangoDecorada(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao() + " Morango";
    }

    @Override
    public Double preco() {
        return bolo.preco() + 6.5;
    }
}
