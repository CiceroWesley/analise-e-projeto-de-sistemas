package lanchonete;

public class SanduichesIngredienteFactoryBarbalha implements  SanduichesIngredientFactory{
    @Override
    public Sanduiche criarSanduiche() {
        return new SanduicheBarbalha();
    }
}
