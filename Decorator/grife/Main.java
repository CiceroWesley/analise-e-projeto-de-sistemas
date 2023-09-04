package grife;

public class Main {
    public static void main(String[] args) {
        String base = "baunilha";
        String cobertura = "doceleite";
        String[] frutas = {"morango", "amora", "pessego"};
        Bolo bolo = null;

        //escolha da base

        if(base == "baunilha"){
            bolo = new BaseBaunilha();
        } else if(base == "chocolate"){
            bolo = new BaseChocolate();
        } else if(base == "laranja"){
            bolo = new BaseLaranja();
        } else if(base == "limao") {
            bolo = new BaseLimao();
        }

        //escolha da cobertura

        if(cobertura == "doceleite"){
            bolo = new CoberturaDoceLeiteDecorada(bolo);
        } else if(cobertura == "chocolate"){
            bolo = new CoberturaChocolateDecorada(bolo);
        } else if(cobertura == "morango"){
            bolo = new CoberturaMorangoDecorada(bolo);
        }

        //escolha das frutas
        for(int i = 0; i < frutas.length ; i++){
            if(frutas[i] == "amora"){
                bolo = new FrutaAmoraDecorada(bolo);
            } else if (frutas[i] == "morango") {
                bolo = new FrutaMorangoDecorada(bolo);
            } else if(frutas[i] == "pessego"){
                bolo = new FrutaPessegoDecorada(bolo);
            }
        }
          System.out.println(bolo.getDescricao());
          System.out.println(bolo.preco());

//        Bolo baunilha = new BaseBaunilha();
//        baunilha = new CoberturaChocolateDecorada(baunilha);
//        baunilha = new FrutaAmoraDecorada(baunilha);
//
//        System.out.println(baunilha.getDescricao());
//        System.out.println(baunilha.preco());
    }
}
