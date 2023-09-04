package grife;

public class FrutaPessegoDecorada extends BoloDecorator{

    public FrutaPessegoDecorada(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao() + " Pessego";
    }

    @Override
    public Double preco() {
        return bolo.preco() + 3;
    }
}
