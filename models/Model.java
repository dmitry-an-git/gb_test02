package models;
import toys.*;

public interface Model {
    
    void setToys(int bears, int cars, int dolls);
    
    Toy playToy();

    String toString();

    int getSize();

}