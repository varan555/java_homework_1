package sweet;

public class Chocolate extends Sweetness {

    private boolean peanut;

    public Chocolate(boolean peanut) {
        setName("Chocolate");
        setPrice(2.57);
        setWeight(2.51);
        this.peanut = peanut;
    }

    public boolean isPeanut() {
        return peanut;
    }

    public void setPeanut(boolean peanut) {
        this.peanut = peanut;
    }
}
