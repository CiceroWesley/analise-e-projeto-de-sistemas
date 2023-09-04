package grife;

public class CoberturaChocolateDecorada extends BoloDecorator{

    public CoberturaChocolateDecorada(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao() + " Cobertura de Chocolate";
    }

    @Override
    public Double preco() {
        return bolo.preco() + 7;
    }
}
