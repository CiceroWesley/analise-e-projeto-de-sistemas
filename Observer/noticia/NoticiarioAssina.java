import java.util.ArrayList;
import java.util.List;

public class NoticiarioAssina extends Noticiario {
    private List<ConsomeNoticia> consumidores = new ArrayList<ConsomeNoticia>();

    @Override
    public void adicionarConsumidor(ConsomeNoticia consumidor) {
        consumidores.add(consumidor);
    }

    @Override
    public void removerConsumidor(ConsomeNoticia consumidor) {
        consumidores.remove((consumidor));
    }

    public void noticia(String textoNoticia, int dia, int mes, String topico){
        System.out.println("Nova notícia recebida!");
        notificaNoticia(textoNoticia,dia,mes,topico);
    }

    @Override
    public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
        for(int i=0; i < consumidores.size(); i++){
            consumidores.get(i).notificaNoticia(textoNoticia,dia,mes,topico);
        }

    }
}
