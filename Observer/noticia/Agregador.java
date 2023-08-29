public abstract class Agregador implements ConsomeNoticia{
    @Override
    public abstract void notificaNoticia(String textoNoticia, int dia, int mes, String topico);
}
