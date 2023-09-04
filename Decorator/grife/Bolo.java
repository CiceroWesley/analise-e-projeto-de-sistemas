package grife;

public abstract class Bolo {
    protected String descricao;

    public String getDescricao(){
        return descricao;
    }

    public abstract Double preco();
}
