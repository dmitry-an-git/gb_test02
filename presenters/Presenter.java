package presenters;
import java.util.Scanner;

import models.*;
import toys.Toy;
import vault.*;

public class Presenter implements View{
    
    Model model;
    VaultModel vault;
    Scanner sc; 

    public Presenter(Model model, VaultModel vault) {
        this.model = model;
        this.vault = vault;
        this.sc = new Scanner(System.in);
    }

    @Override
    public void setToys() {
        System.out.println("\nPlease enter the amounts of toys to be in the store:\n");
        System.out.printf("\tTeddy Bears: ");
        int bears = sc.nextInt();
        System.out.printf("\tToy Cars: ");
        int cars = sc.nextInt();
        System.out.printf("\tDolls: ");
        int dolls = sc.nextInt();
        model.setToys(bears, cars, dolls);
        System.out.println("\nOk, the toys are in the store:\n");
    }

    @Override
    public void startGame() {
        System.out.println("Let's start the game!\n");
        Toy prize = model.playToy();
        vault.newToy(prize);

        int step = 1;
        System.out.printf("\tStep %d: The first prize: %s (id: %d).\n", step, prize.getName(), prize.getId());
        boolean play = true;
        
        while (play) {
            step += 1;
            System.out.printf("\t\tEnter 'y' to continue: ");
            String selection = sc.next();
            if (model.getSize()==0) {
                play = false;
                System.out.println("\nThere are no more toys to play!");
            } else {
                if (!selection.equals("y") && !selection.equals("Y")) {
                    play = false;
                    System.out.println("Bye!");
                } else {
                    prize = model.playToy();
                    System.out.printf("\tStep %d: The next prize is a %s (id: %d).\n", step, prize.getName(), prize.getId());
                    vault.newToy(prize);
                }
            }    
        }
        System.out.println("The game is over!");
    }
    
    
    @Override
    public void getPrizes() {
        System.out.println("\nTime to receive your prizes!\n");
        Toy prize = vault.getToy();
        System.out.printf("\tYou've got the first prize: %s (id: %d).\n", prize.getName(), prize.getId());
        boolean play = true;
        while (play) {
            System.out.printf("\t\tEnter 'y' to continue: ");
            String selection = sc.next();
            if (vault.getSize()==0) {
                play = false;
                System.out.println("\nThere are no more prizes left.");
                System.out.println("Your toys are in the file.\nBye!\n");
            } else {
                if (!selection.equals("y") && !selection.equals("Y")) {
                    play = false;
                    System.out.println("Bye!");
                } else {
                    prize = vault.getToy();
                    System.out.printf("\tYour next prize is: %s (id: %d).\n", prize.getName(), prize.getId());
                }
            }    
        }
    }

    @Override
    public void showToysInStore() {
        System.out.println(model); 
    }
 
}
