import models.*;
import presenters.*;
import vault.*;

public class Program {

    public static void main(String[] args) {
        
        Model toyStore = new ToyStore(); 
        VaultModel vault = new Vault(); 
        Presenter presenter = new Presenter(toyStore, vault); 
        Menu menu = new Menu(presenter);
        menu.play();
    }
}
