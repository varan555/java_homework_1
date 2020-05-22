package sweet;

public class Chocolate extends Sweetness {

    private boolean peanut;

    public Chocolate(boolean peanut, String name, double weight, double price) {
        super(name, weight,  price);
        this.peanut = peanut;
    }

    public boolean isPeanut() {
        return peanut;
    }

    public void setPeanut(boolean peanut) {
        this.peanut = peanut;
    }
}
