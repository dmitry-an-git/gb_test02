package models;

import toys.*;

public interface Model {

    /**
     * initialises a toystore with required number of Toy objects
     * @param bears 
     * @param cars
     * @param dolls
     */
    void setToys(int bears, int cars, int dolls);

    /**
     * returns a random Toy from the toystore (and removes it)
     */
    Toy playToy();

    /**
     * returns textual representation of the Toy objects that are in the toystore
     */
    String toString();

    /**
     * just the number of Toy objects in the store
     */
    int getSize();

}