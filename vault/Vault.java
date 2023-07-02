package vault;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import toys.*;

public class Vault implements VaultModel {
    
    private LinkedList<Toy> storage;

    public Vault() {
        this.storage = new LinkedList<>();
    }

    @Override
    public void newToy(Toy toy){
        storage.add(toy);
    }

    @Override
    public String toString() {
        
        String out = new String();
        if (storage.size()==0) {
            out = "There is nothing in the vault!";
        }
        for (Toy toy : storage) {
            out = out + "\t" + toy.toString() + "\n";
        }
        return out;
        
    }

    @Override
    public Toy getToy() {
        Toy toy = storage.removeFirst();

        String fileName = "toy_prizes.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(toy.toString()); 
            writer.write("\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return toy;
    }

    @Override
    public int getSize() {
        return storage.size();
    }
    

    
}
