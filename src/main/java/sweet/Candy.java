package sweet;

public class Candy extends Sweetness {
    private int quantity;

    public Candy(int quality, String name, double weight, double price) {
        super(name, weight,  price);
        this.quantity = quality;
    }

    public int getQuality() {
        return quantity;
    }

    public void setQuality(int quality) {
        this.quantity = quality;
    }
}
