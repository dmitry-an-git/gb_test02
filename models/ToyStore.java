package models;

import java.util.LinkedList;
import java.util.Random;
import toys.*;

public class ToyStore implements Model{
    private LinkedList<Toy> storage;
    private Random random;

    public ToyStore() {
        this(0,0,0);
    }

    public ToyStore(int bears, int cars, int dolls) {
        this.storage = new LinkedList<>();
        setToys(bears, cars, dolls);
    }

    @Override
    public void setToys(int bears, int cars, int dolls) {

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

    @Override
    public Toy playToy() {
        if (storage.size() == 0) {
            return null;
        }
        this.random = new Random();
        int index = random.nextInt(storage.size());
        Toy prize = storage.remove(index);
        return prize;
    }

    @Override
    public String toString() {
        String out = new String();
        if (storage.size()==0) {
            out = "The toystore is empty!";
        }
        for (Toy toy : storage) {
            out = out + "\t" + toy.toString() + "\n";
        }
        return out;
    }

    @Override
    public int getSize() {
        return storage.size();
    }
    

}
