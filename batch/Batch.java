package batch;
import java.util.ArrayList;
import java.util.List;
import toys.Toy;

public class Batch<toy> {
    private List<Object> batch;

    public Batch() {
        this.batch = new ArrayList<>();
    }

    public void addToy(T) {
        this.batch.add(newToy);
    } 

    public int getLength() {
        return batch.size();
    }

    @Override 
    public int compareTo(Batch o) {
        return Double.compare(o.getLength(), getLength());
    }
}
