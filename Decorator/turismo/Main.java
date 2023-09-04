package turismo;

public class Main {
    public static void main(String[] args) {
        //foi colocado uma condição para cada tipo de destino o usuario pode escolher
        //entrando o dado por algum input
        String destino = "cruzeiro";
        Viagem viagem = null;

        //escolha do destino

        if(destino == "cruzeiro"){
            viagem = new Cruzeiro();
        } else if (destino == "campo") {
            viagem = new Campo();
        } else if (destino == "praia") {
            viagem = new Praia();
        }

        //pacotes

        //bebidas

        viagem = new BebidasDecorada(viagem,"alcoolica", 10.5);
        viagem = new PasseioExtraDecorada(viagem,"Cancum", 115.0);
        viagem = new MassagemDecorada(viagem,"leve", 37.58);

        //poderia ser colocado dessa forma também
        //viagem = new MassagemDecorada(new PasseioExtraDecorada(new BebidasDecorada(new Cruzeiro(),"alcoolica", 10.5),"Cancum", 115.0),"leve", 37.58);


        System.out.println(viagem.getDescricao());
        System.out.println(viagem.getPreco());


    }
}
