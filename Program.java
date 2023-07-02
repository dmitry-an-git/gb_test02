import models.*;
import presenters.*;
import vault.*;

public class Program {

    public static void main(String[] args) {
        
        Model toyStore = new ToyStore();
        VaultModel vault = new Vault();
        Presenter presenter = new Presenter(toyStore, vault);
        presenter.setToys();
        System.out.println(toyStore);
        presenter.startGame();
        presenter.getPrize();

    }
}
