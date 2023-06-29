import toys.*;

public class Program {

    public static void main(String[] args) {
        
        ToyStore toyStore = new ToyStore(2,2,6);
        for (int i = 0; i < 10; i++) {
            System.out.println(toyStore.playToy());
        }

    }
}
