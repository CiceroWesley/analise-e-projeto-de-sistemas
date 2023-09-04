package grife;

public abstract class BoloDecorator  extends Bolo{
    protected Bolo bolo;

    public BoloDecorator(Bolo bolo){
        this.bolo = bolo;
    }

    public abstract String getDescricao();

    @Override
    public abstract Double preco();
}
