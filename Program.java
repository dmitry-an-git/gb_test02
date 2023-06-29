import toys.*;
import batch.Batch;
public class Program {

    public static void main(String[] args) {
        ToyDoll doll0 = new ToyDoll();
        System.out.println(doll0.getInfo());
        ToyDoll doll1 = new ToyDoll();
        System.out.println(doll1.getInfo());
        ToyCar car0 = new ToyCar();
        System.out.println(car0.getInfo());
        
        Batch<ToyDoll> dolls = new Batch<>();
        for (int i = 0; i < 2; i++) {
            dolls.addToy(new ToyDoll());
        }

        Batch<ToyCar> cars = new Batch<>();
        for (int i = 0; i < 2; i++) {
            cars.addToy(new ToyCar());
        }

        Batch<ToyBear> bears = new Batch<>();
        for (int i = 0; i < 6; i++) {
            bears.addToy(new ToyBear());
        }

        ToyStore toyStore = new ToyStore();
        
    }
}
