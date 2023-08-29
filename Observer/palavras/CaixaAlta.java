//Concrete observer
public class CaixaAlta implements Rotulo{

    @Override
    public void atualizarMudanca(String campoDeTexto) {
        String maiusculo = campoDeTexto.toUpperCase();
        System.out.println("Texto em caixa alta: " + maiusculo);
    }
}
