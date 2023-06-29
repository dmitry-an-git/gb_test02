package toys;

public abstract class Toy {

    protected static int counter;
    protected int id;
    protected String name;

    protected Toy(String name) {
        this.id = ++Toy.counter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Toy: %s, ID: %d\n",this.name, this.id);
    } 
    
}