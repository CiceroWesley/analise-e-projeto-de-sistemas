package grife;

public class FrutaAmoraDecorada extends BoloDecorator{

    public FrutaAmoraDecorada(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao() + " Amora";
    }

    @Override
    public Double preco() {
        return bolo.preco() + 4;
    }
}
