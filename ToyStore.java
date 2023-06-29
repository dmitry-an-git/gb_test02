
import java.util.LinkedList;
import java.util.Random;
import toys.*;



public class ToyStore {
    private LinkedList<Toy> storage;
    private Random random;

    public ToyStore(int bears, int cars, int dolls) {
        this.storage = new LinkedList<>();

        for (int i = 0; i < bears; i++) {
            storage.add(new ToyBear());
        }

        for (int i = 0; i < cars; i++) {
            storage.add(new ToyCar());
        }

        for (int i = 0; i < dolls; i++) {
            storage.add(new ToyDoll());
        }
    }

    public Toy playToy() {
        this.random = new Random();
        int index = random.nextInt(storage.size());
        Toy prize = storage.remove(index);
        return prize;
    }
}
