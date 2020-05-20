package sweet;

public class Candy extends Sweetness {
    private int quantity;

    public Candy(int quality) {
        setName("Candy");
        setPrice(3.78);
        setWeight(5.61);
        this.quantity = quality;
    }

    public int getQuality() {
        return quantity;
    }

    public void setQuality(int quality) {
        this.quantity = quality;
    }
}
