import java.util.ArrayList;
import java.util.List;

public class AgregadorMes extends Agregador {
    private List<ConsomeNoticia> assinantes = new ArrayList<ConsomeNoticia>();
    private String topico;
    private static String noticias;
    private static long quantidade;
    private static int mes;

    public AgregadorMes(String topico){
        this.topico = topico;
        this.noticias = "";
        this.quantidade = 0;
        this.mes = 0;
    }

    public void adicionarAssinante(ConsomeNoticia Assinante, String topico) {
        if (this.topico.equals(topico)) {
            assinantes.add(Assinante);
        }
    }

    public void removerAssinante(ConsomeNoticia Assinante) {
        assinantes.remove((Assinante));
    }

    public void noticia(String textoNoticia, int dia, int mesN, String topico) {
        if (quantidade == 0) {
            //quantidade++;
            mes = mesN;
            //noticias += textoNoticia;
        }

        if (mes == mesN) {
            quantidade++;
            noticias += textoNoticia;
        } else {
            notificaNoticia(noticias, 0,mes,"Mensal");
            mes = mesN;
            noticias = textoNoticia;
            quantidade = 1;
        }
    }

    @Override
    public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
        for (int i = 0; i < assinantes.size(); i++) {
            assinantes.get(i).notificaNoticia(textoNoticia, dia, mes, topico);
        }
    }
}
