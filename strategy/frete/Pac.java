public class Pac implements Distribuidora{

    @Override
    public double calcularFrete(double peso, double distancia) {
        return (peso/30) + (distancia/80) + 25;
    }
}
