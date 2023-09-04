package turismo;

public class Praia extends Viagem{

    public Praia(){
        this.descricao = "Praia";
        this.preco = 70.0;
    }

    @Override
    public Double getPreco() {
        return preco;
    }
}
