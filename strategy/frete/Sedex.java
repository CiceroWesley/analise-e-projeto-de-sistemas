public class Sedex implements Distribuidora {

    @Override
    public double calcularFrete(double peso, double distancia) {
        return (peso/80) + (distancia/40) + 75;
    }
}

