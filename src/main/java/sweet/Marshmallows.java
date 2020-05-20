package sweet;

public class Marshmallows extends Sweetness {

    private boolean vanile;

    public Marshmallows(boolean vanile) {
        setName("Marshmallows");
        setPrice(3.87);
        setWeight(2.94);
        this.vanile = vanile;
    }

    public boolean isVanile() {
        return vanile;
    }

    public void setVanile(boolean vanile) {
        this.vanile = vanile;
    }
}
