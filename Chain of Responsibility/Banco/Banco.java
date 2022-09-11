public abstract class Banco {
    protected long identificador;
    protected Banco nextBanco;

    public Banco (long identificador, Banco nextBanco){
        this.identificador = identificador;
        this.nextBanco = nextBanco;
    }

    public abstract void efetuarPagamento(long identificador);

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public Banco getNextBanco() {
        return nextBanco;
    }

    public void setNextBanco(Banco nextBanco) {
        this.nextBanco = nextBanco;
    }
}
