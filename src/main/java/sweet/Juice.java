package sweet;

public class Juice extends Sweetness {
    private double capacity;

    public Juice(double capacity, String name, double weight, double price) {
        super(name, weight,  price);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
