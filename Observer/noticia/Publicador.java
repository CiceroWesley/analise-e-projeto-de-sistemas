public class Publicador implements ConsomeNoticia{
    private String nome;
    private String topico;

    public Publicador(String nome, String topico){
        this.nome = nome;
        this.topico = topico;
    }

    public String getTopico() {
        return this.topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    @Override
    public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
        System.out.println(this.nome);
        System.out.println("Topico:"+ topico + " texto:"+ textoNoticia + " do dia: " + dia + " mes:" + mes);
    }
}
