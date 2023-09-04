package grife;

public class BaseBaunilha extends Bolo {

    public BaseBaunilha(){
        this.descricao = "Bolo de baunilha";
    }

    @Override
    public Double preco() {
        return 13.0;
    }
}
