package grife;

public class BaseLimao extends Bolo {

    public BaseLimao(){
        this.descricao = "Bolo de limão";
    }

    @Override
    public Double preco() {
        return 15.0;
    }
}
