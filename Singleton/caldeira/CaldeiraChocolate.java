public class CaldeiraChocolate {
    private boolean empty;
    private boolean boiled;
    private static CaldeiraChocolate caldeira;


    //só é iniciado quando a caldeira está vazia
    private CaldeiraChocolate() {
        this.empty = true;
        this.boiled = true;
    }

    public static CaldeiraChocolate getInstance(){
        if(CaldeiraChocolate.caldeira == null){
            caldeira = new CaldeiraChocolate(); // ou CaldeiraChocolate.caldeira
        }
        return caldeira;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            //preencha a caldeira com uma mistura de leite e chocolate
            System.out.println("Fill");
        }
    }

    //para drenar a caldeira ela deve estar cheia e também em ebulição
    public void drain() {
        if(isEmpty() && isBoiled()) {
            //drene o leite e o chocolate fervidos
            System.out.println("Drain");
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            //coloque o conteúdo em ebulição
            System.out.println("Boil");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
