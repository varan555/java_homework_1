package sweet;

public class Juice extends Sweetness {
    private double capacity;

    public Juice(double capacity) {
        setName("Juice");
        setPrice(3.54);
        setWeight(3.2);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
