import java.util.ArrayList;
import java.util.List;

public class AgregadorTopico extends Agregador{
    private List<ConsomeNoticia> assinantes = new ArrayList<ConsomeNoticia>();
    private String topico;
    private static String noticias;
    private static long noticiasQtd;

    public AgregadorTopico(String topico){
        this.topico = topico;
        this.noticias = "";
        this.noticiasQtd = 0;
    }

    public void adicionarAssinante(ConsomeNoticia Assinante, String topico) {
        if(this.topico.equals(topico)){
            assinantes.add(Assinante);
        }
    }

    public void removerAssinante(ConsomeNoticia Assinante) {
        assinantes.remove((Assinante));
    }

    public void noticia(String textoNoticia, int dia, int mes, String topico){
        if(this.topico.equals(topico)){
            noticiasQtd++;
            noticias = noticias + textoNoticia;
        }
        if(noticiasQtd == 3){
            notificaNoticia(noticias,dia,mes,this.topico);
            noticiasQtd = 0;
            noticias = "";
        }
    }
    @Override
    public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
        for(int i=0; i < assinantes.size(); i++){
            assinantes.get(i).notificaNoticia(textoNoticia,dia,mes,topico);
        }


    }
}
