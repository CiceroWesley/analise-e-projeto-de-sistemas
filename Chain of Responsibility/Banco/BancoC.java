public class BancoC extends Banco{

    public BancoC(long identificador, Banco nextBanco){
        super(identificador,nextBanco);
    }
    @Override
    public void efetuarPagamento(long identificador) {
        if(identificador == this.identificador){
            System.out.println("Pagamento efetuado com sucesso no banco:" + this.identificador);
        } else if (this.nextBanco != null) {
            System.out.println("Não foi possível realizar o pagamento no banco:"+ this.identificador + ", encaminhando para o próximo banco.");
            this.nextBanco.efetuarPagamento(identificador);
        }
        else {
            System.out.println("Não foi possível realizar o pagamento no banco "+ this.identificador+ " e esse banco não possui sucessor.");
        }
    }
}
