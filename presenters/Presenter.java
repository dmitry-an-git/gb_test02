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
        System.out.println("Please enter the amounts of toys to be in the store:");
        System.out.printf("\tTeddy Bears: ");
        int bears = sc.nextInt();
        System.out.printf("\tToy Cars: ");
        int cars = sc.nextInt();
        System.out.printf("\tDolls: ");
        int dolls = sc.nextInt();
        model.setToys(bears, cars, dolls);
        System.out.println("Ok, the toys are in the store!");
    }

    @Override
    public void startGame() {
        System.out.println("Let's start the game!");
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
                System.out.println("There are no more toys to play!");
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
    public void getPrize() {
        System.out.println("Time to receive the prizes!");
        Toy prize = vault.getToy();
        System.out.printf("\tYou've got the first prize: %s (id: %d).\n", prize.getName(), prize.getId());
        boolean play = true;
        while (play) {
            System.out.printf("\t\tEnter 'y' to continue: ");
            String selection = sc.next();
            if (vault.getSize()==0) {
                play = false;
                System.out.println("There are no more prizes left! Bye!");
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
    public void saveFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveFile'");
    }
 

}
