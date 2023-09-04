package turismo;

public class Cruzeiro extends Viagem{

    public Cruzeiro(){
        this.descricao = "Cruzeiro";
        this.preco = 100.0;
    }

    @Override
    public Double getPreco() {
        return preco;
    }
}
