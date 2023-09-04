package turismo;

public class Campo extends Viagem{

    public Campo(){
        this.descricao = "Campo";
        this.preco = 60.0;
    }

    @Override
    public Double getPreco() {
        return preco;
    }
}
