import java.util.List;

public abstract class Noticiario {

    public abstract void adicionarConsumidor(ConsomeNoticia consumidor);
    public abstract void removerConsumidor(ConsomeNoticia consumidor);
    public abstract void notificaNoticia(String textoNoticia, int dia, int mes, String topico);
}
