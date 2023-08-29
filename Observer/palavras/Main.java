public class Main {
    public static void main(String[] args) {
        CampoTexto campoTexto = new CampoTexto("Setembro");
        CaracteresQtd caracteresQtd = new CaracteresQtd();
        PalavrasQtd palavrasQtd = new PalavrasQtd();
        CaixaAlta caixaAlta = new CaixaAlta();

        campoTexto.adicionarRotulo(caracteresQtd);
        campoTexto.adicionarRotulo(palavrasQtd);
        campoTexto.adicionarRotulo(caixaAlta);

        campoTexto.setCampoDeTexto("Agosto e Setembro");

    }

}
