package lanchonete;

public class SanduichesIngredienteFactoryJuazeiro  implements  SanduichesIngredientFactory{
    @Override
    public Sanduiche criarSanduiche() {
        return new SanduicheJuazeiro();
    }
}
