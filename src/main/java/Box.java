import sweet.*;

import java.util.*;

public class Box implements BoxAction {

    private ArrayList<Sweetness> present = new ArrayList<>();

    public void creatPresent() {
        ArrayList<Sweetness> result = new ArrayList<>();
        result.add(new Candy(7, "Барбарис", 0.54, 0.78));
        result.add(new Candy(3, "Киевские", 0.34, 0.87));
        result.add(new Chocolate(false, "Баунти", 0.25, 1.34));
        result.add(new Juice(0.9, "Фанта", 0.33, 1.78));
        result.add(new Marshmallows(true, "Сказка", 0.48, 1.74));
        result.add(new Chocolate(true, "Марс", 0.25, 1.78));
        this.present = result;
    }


    @Override
    public void add(ArrayList<Sweetness> list, Sweetness sweet) {
        list.add(sweet);
    }

    @Override
    public void deleteByID(ArrayList<Sweetness> list, int id) {
        list.remove(id);
    }

    @Override
    public void deleteLast(ArrayList<Sweetness> list) {
        list.remove(list.size() - 1);
    }

    public void showAllSweet(ArrayList<Sweetness> list) {
        for (Sweetness sw : list) {
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
    public double showPrice(ArrayList<Sweetness> list) {
        double result = 0;
        for (Sweetness sw : list) {
            result = result + sw.getPrice();
        }
        return result;
    }

    @Override
    public double showWeight(ArrayList<Sweetness> list) {
        double result = 0.0;
        for (Sweetness sw : list) {
            result = result + sw.getWeight();
        }
        return result;
    }

    public void reduceWeight(double weight, Box box) {
        Box boxSorted = new Box();
        LinkedHashMap<Sweetness, Double> map = new LinkedHashMap<>();  //создаем мапу: ключ-сладость из box, значение - ее вес
        for (Sweetness sw : box.getPresent()) {
            map.put(sw, sw.getWeight());
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<Sweetness, Double>comparingByValue()         //сортируем мапу по весу, переворачиваем её
                        .reversed())                                    // и копируем множество сладостей в поле объекта boxSorted
                .forEach(x -> boxSorted.getPresent().add(x.getKey()));


        for (Iterator<Sweetness> iterator = boxSorted.getPresent().iterator(); iterator.hasNext(); ) {
            Sweetness value = iterator.next();                           // я хз как по другому сделать
            if (boxSorted.showWeight(boxSorted.getPresent())>weight) {
                iterator.remove();
            }
        }

        showAllSweet(boxSorted.getPresent());
        System.out.println("Осортированный по весу");
        System.out.println("-----------------------------------");
        System.out.println("Общий вес подарка:  " + showWeight(boxSorted.getPresent()));
        System.out.println("-----------------------------------");
        showWeight(boxSorted.getPresent());
    }

    public void reducePrice(double price, Box box) {  // я хз как по другому сделать
        Box boxSorted = new Box();
        LinkedHashMap<Sweetness, Double> map = new LinkedHashMap<>();  //создаем мапу: ключ-сладость из box, значение - ее вес
        for (Sweetness sw : box.getPresent()) {
            map.put(sw, sw.getPrice());
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<Sweetness, Double>comparingByValue()         //сортируем мапу по весу, переворачиваем её
                        .reversed())                                    // и копируем множество сладостей в поле объекта boxSorted
                .forEach(x -> boxSorted.getPresent().add(x.getKey()));


        for (Iterator<Sweetness> iterator = boxSorted.getPresent().iterator(); iterator.hasNext(); ) {
            Sweetness value = iterator.next();
            if (boxSorted.showPrice(boxSorted.getPresent())>price) {
                iterator.remove();
            }
        }

        showAllSweet(boxSorted.getPresent());
        System.out.println("Осортированный по цене");
        System.out.println("-----------------------------------");
        System.out.println("Общая стоимость подарка:  " + showPrice(boxSorted.getPresent()));
        System.out.println("-----------------------------------");
        showWeight(boxSorted.getPresent());
    }
}