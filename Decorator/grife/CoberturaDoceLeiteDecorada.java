package grife;

public class CoberturaDoceLeiteDecorada extends BoloDecorator{

    public CoberturaDoceLeiteDecorada(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao() + " Cobertura de Doce de Leite";
    }

    @Override
    public Double preco() {
        return bolo.preco() + 6.5;
    }
}
