public class Main {
    public static void main(String[] args) {
        String TiposFrete = "PAC";
        Frete frete1 = new Frete();
        switch (TiposFrete){
            case "PAC":
                frete1.setDistribuidora(new Pac());
                break;
            case "SEDEX":
                frete1.setDistribuidora(new Sedex());
                break;
            case "FEDEX":
                frete1.setDistribuidora(new Fedex());
                break;
            case "JADLOG":
                frete1.setDistribuidora(new Jadlog());
                break;
        }

        double resultado = frete1.calcularFrete(10,3000);
        System.out.println(resultado);

    }
}
