package presenters;

public interface View {
    /**
     * asks user for the number of toys to be in the toystore.
     */
    void setToys();

    /**
     * returns a string with txt representation of all Toy objects in Toystore
     */
    void showToysInStore();

    /**
     * asks user it he wants to play one more round and saves toys to the vault
     */
    void startGame();

    /**
     * takes the toys from the vault and saves them to the txt file
     */
    void getPrizes();

}
