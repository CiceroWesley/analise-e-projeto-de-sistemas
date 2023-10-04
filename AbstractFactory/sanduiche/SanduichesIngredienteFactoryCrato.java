package lanchonete;

public class SanduichesIngredienteFactoryCrato implements  SanduichesIngredientFactory{
    @Override
    public Sanduiche criarSanduiche() {
        return new SanduicheCrato();
    }
}
