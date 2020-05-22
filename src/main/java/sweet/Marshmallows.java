package sweet;

public class Marshmallows extends Sweetness {

    private boolean vanile;

    public Marshmallows(boolean vanile, String name, double weight, double price) {
        super(name, weight,  price);
        this.vanile = vanile;
    }

    public boolean isVanile() {
        return vanile;
    }

    public void setVanile(boolean vanile) {
        this.vanile = vanile;
    }
}
