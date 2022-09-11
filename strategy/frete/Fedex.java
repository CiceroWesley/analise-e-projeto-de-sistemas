public class Fedex implements Distribuidora {

    @Override
    public double calcularFrete(double peso, double distancia) {
        return (peso/10) + (distancia/50) + 50;
    }
}
