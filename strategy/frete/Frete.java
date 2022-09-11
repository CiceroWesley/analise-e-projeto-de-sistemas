public class Frete {
    private Distribuidora distribuidora;

    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    public double calcularFrete(double peso, double distancia){
        return this.distribuidora.calcularFrete(peso,distancia);
    }
}
