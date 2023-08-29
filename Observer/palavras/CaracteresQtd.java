//Concrete observer
public class CaracteresQtd implements Rotulo{

    @Override
    public void atualizarMudanca(String campoDeTexto) {
        String noSpace = campoDeTexto.replace(" ", "");
        long qtd = campoDeTexto.length();
//        long qtd1 = noSpace.length();
        System.out.println("Quantidade de caracteres:"+ qtd);
//        System.out.println("Quantidade de caracteres sem espaço:"+ qtd1);
    }
}
