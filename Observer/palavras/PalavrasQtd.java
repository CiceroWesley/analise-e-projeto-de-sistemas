//Concrete observer
public class PalavrasQtd implements Rotulo{

    @Override
    public void atualizarMudanca(String campoDeTexto) {
        String[] campoDeTextoSplit = campoDeTexto.split(" ");
        long palavrasQtd = campoDeTextoSplit.length;
        System.out.println("Quantidade de palavras:"+palavrasQtd);
    }
}
