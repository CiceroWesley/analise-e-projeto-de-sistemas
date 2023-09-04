package grife;

public class BaseChocolate extends Bolo {

    public BaseChocolate(){
        this.descricao = "Bolo de chocolate";
    }

    @Override
    public Double preco() {
        return 16.0;
    }
}
