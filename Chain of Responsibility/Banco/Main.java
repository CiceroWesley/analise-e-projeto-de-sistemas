public class Main {
    public static void main(String[] args) {
        Banco c = new BancoC(3,null);
        Banco b = new BancoB(2,c);
        Banco a = new BancoA(1,b);

        //identificador do banco destino
        a.efetuarPagamento(2);
        b.efetuarPagamento(3);
        c.efetuarPagamento(3);

    }
}
