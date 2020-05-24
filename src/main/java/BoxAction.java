import sweet.Sweetness;

public interface BoxAction {


        public void add(Sweetness sweet);
        public void deleteByID(int id);
        public void deleteLast();
        public double showPrice();
        public double showWeight ();


}
