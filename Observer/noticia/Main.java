public class Main {
    public static void main(String[] args) {
        NoticiarioAssina noticiario = new NoticiarioAssina();
        Publicador globo = new Publicador("Publicador1","teste");
        noticiario.adicionarConsumidor(globo);
        noticiario.noticia("Falecimento da Rainha Elizabeth II", 8,9,"Monarquia");
        noticiario.noticia("Nova pesquisa eleitoral", 15,9,"Política");

        AgregadorTopico agregaPorTopico = new AgregadorTopico("geral");
        Publicador sbt = new Publicador("Publicador2", "geral");
        Publicador record = new Publicador("Publicador3", "geral1");
        agregaPorTopico.adicionarAssinante(sbt, sbt.getTopico());
        //é para não adicionar, pois agregaPorTopico é do tópico geral e o publicador3(record) é do tópico geral1, não geral.

        agregaPorTopico.adicionarAssinante(record,record.getTopico());
        agregaPorTopico.noticia("texto1",8,9,"geral");
        agregaPorTopico.noticia("texto2",8,10,"geral");
        agregaPorTopico.noticia("texto3",8,11,"geral");

        agregaPorTopico.noticia("texto1",8,12,"geral");
        agregaPorTopico.noticia("texto2",8,13,"geral");
        agregaPorTopico.noticia("texto22",8,13,"geral1");
        agregaPorTopico.noticia("texto3",8,14,"geral");


        agregaPorTopico.noticia("texto23",8,13,"geral1");
        agregaPorTopico.noticia("texto24",8,13,"geral1");

        AgregadorMes agregaMes = new AgregadorMes("Mensal");
        Publicador band = new Publicador("Band","Mensal");
        Publicador globo2 = new Publicador("Globo","Mensal");
        agregaMes.adicionarAssinante(band,band.getTopico());
        agregaMes.adicionarAssinante(globo2,globo2.getTopico());

        agregaMes.noticia("News1",1,9,"mes");
        agregaMes.noticia("News2",6,9,"mes");
        agregaMes.noticia("News3",8,9,"mes");

        agregaMes.noticia("News4",22,8,"mes");
        agregaMes.noticia("News5",24,8,"mes");

        agregaMes.noticia("News6",22,11,"mes");

    }
}
