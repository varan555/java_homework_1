import Interfaces.*;
import sweet.*;

import java.util.ArrayList;
import java.util.List;

public class Box implements ShowPrice, ShowWeight{

    private ArrayList<Sweetness> present;

    public void creatPresent() {
        ArrayList<Sweetness> result = new ArrayList<>();
        result.add(new Candy(7));
        result.add(new Candy(3));
        result.add(new Chocolate(false));
        result.add(new Juice(0.9));
        result.add(new Marshmallows(true));
        result.add(new Chocolate(true));
        this.present = result;
    }

    Add add = (list, sweet)->list.add(sweet);

    DeleteLast deleteLast = (list)->list.remove(list.size()-1);

    DeleteByID deleteByID = (list, id)->list.remove(id);

    public void showAllSweet (ArrayList<Sweetness> list) {
        for (Sweetness sw: list) {
            System.out.println(sw.getName() + " весом: " + sw.getWeight() + "  стоимостью: " + sw.getPrice());
        }
    }

    public ArrayList<Sweetness> getPresent() {
        return present;
    }

    public void setPresent(ArrayList<Sweetness> present) {
        this.present = present;
    }

    @Override
    public void showPrice(ArrayList<Sweetness> list) {
        double result = 0;
        for (Sweetness sw: list) {
            result = result + sw.getPrice();
        }
        System.out.println("Общая стоимость подарка:  " + result);
    }

    @Override
    public void showWeight(ArrayList<Sweetness> list) {
        double result = 0;
        for (Sweetness sw: list) {
            result = result + sw.getWeight();
        }
        System.out.println("Общий вес подарка:  " + result);
    }
}
