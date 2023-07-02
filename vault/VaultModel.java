package vault;
import toys.*;

public interface VaultModel {

    void newToy(Toy toy);

    /**
     * to display all Toy objects in the vault 
     * @return string with txt representation of all toys in the vault
     */
    String toString();

    /**
     * picks the first Toy object in the vault &
     * saves its txt representation to a txt file & 
     * removes it from the vault
     */
    Toy getToy();

    /**
     * @return the number of Toy objects in the vault
     */
    int getSize();
}
