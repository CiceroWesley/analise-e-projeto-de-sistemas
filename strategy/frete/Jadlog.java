public class Jadlog implements Distribuidora {

    @Override
    public double calcularFrete(double peso, double distancia) {
        return (peso) + (distancia/35) + 65;

    }
}
