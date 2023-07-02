package vault;
import toys.*;

public interface VaultModel {

    void newToy(Toy toy);

    String toString();

    Toy getToy();

    int getSize();
}
