package grife;

public class BaseLaranja extends Bolo {

    public BaseLaranja(){
        this.descricao = "Bolo de laranja";
    }

    @Override
    public Double preco() {
        return 15.0;
    }
}
