public class Main {
    public static void main(String[] args) {
        CaldeiraChocolate caldeira = CaldeiraChocolate.getInstance();
//        caldeira.drain();
//        caldeira.fill();
        caldeira.boil();
        System.out.println(caldeira.isEmpty());
        CaldeiraChocolate caldeira2 = CaldeiraChocolate.getInstance();
        caldeira2.fill();
        caldeira.boil();
        System.out.println(caldeira.isEmpty());
    }
}
