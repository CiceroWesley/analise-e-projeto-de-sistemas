import java.util.ArrayList;
import java.util.List;

//Concrete subject
public class CampoTexto extends Texto {
    private List<Rotulo> rotulos = new ArrayList<Rotulo>();
    private String campoDeTexto;

    public CampoTexto(String campoDeTexto){
        this.campoDeTexto = campoDeTexto;
    }

    public String getCampoDeTexto() {
        return campoDeTexto;
    }

    public void setCampoDeTexto(String campoDeTexto) {
        this.campoDeTexto = campoDeTexto;
        noticiaMudanca(campoDeTexto);
    }

    @Override
    public void adicionarRotulo(Rotulo rotulo) {
        rotulos.add(rotulo);
    }

    @Override
    public void removerRotulo(Rotulo rotulo) {
        rotulos.remove(rotulo);
    }

    @Override
    public void noticiaMudanca(String campoDeTexto) {
        for(int i = 0; i < rotulos.size(); i++){
            rotulos.get(i).atualizarMudanca(campoDeTexto);
        }

    }


}
