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

    public Box() {
        creatPresent();
    }

    @Override
    public void add(Sweetness sweet) {
        present.add(sweet);
    }


    @Override
    public void deleteByID(int id) {
        present.remove(id);
    }

    @Override
    public void deleteLast() {
        present.remove(present.size() - 1);
    }

    public void showAllSweet() {
        for (Sweetness sw : present) {
            System.out.println(sw.getName() + " весом: " + sw.getWeight() + "  стоимостью: " + sw.getPrice());
        }
    }


//    private ArrayList<Sweetness> getPresent() {
//        return present;
//    }

//    public void setPresent(ArrayList<Sweetness> present) {
//        this.present = present;
//    }

    @Override
    public double showPrice() {
        double result = 0;
        for (Sweetness sw : present) {
            result = result + sw.getPrice();
        }
        return result;
    }

    @Override
    public double showWeight() {
        double result = 0.0;
        for (Sweetness sw : present) {
            result = result + sw.getWeight();
        }
        return result;
    }

    public void reduceWeight(double weight) {
        LinkedHashMap<Sweetness, Double> map = new LinkedHashMap<>();  //создаем мапу: ключ-сладость из box, значение - ее вес
        for (Sweetness sw : present) {
            map.put(sw, sw.getWeight());
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<Sweetness, Double>comparingByValue()         //сортируем мапу по весу, переворачиваем её
                        .reversed())                                    // и копируем множество сладостей в поле объекта boxSorted
                .forEach(x -> present.add(x.getKey()));


        for (Iterator<Sweetness> iterator =present.iterator(); iterator.hasNext(); ) {
            Sweetness value = iterator.next();                           // я хз как по другому сделать
            if (showWeight()>weight) {
                iterator.remove();
            }
        }

        showAllSweet();
        System.out.println("Осортированный по весу");
        System.out.println("-----------------------------------");
        System.out.println("Общий вес подарка:  " + showWeight());
        System.out.println("-----------------------------------");
        showWeight();
    }

    public void reducePrice(double price) {  // я хз как по другому сделать
        LinkedHashMap<Sweetness, Double> map = new LinkedHashMap<>();  //создаем мапу: ключ-сладость из box, значение - ее вес
        for (Sweetness sw : present) {
            map.put(sw, sw.getPrice());
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<Sweetness, Double>comparingByValue()         //сортируем мапу по весу, переворачиваем её
                        .reversed())                                    // и копируем множество сладостей в поле объекта boxSorted
                .forEach(x ->present.add(x.getKey()));


        for (Iterator<Sweetness> iterator = present.iterator(); iterator.hasNext(); ) {
            Sweetness value = iterator.next();
            if (showPrice()>price) {
                iterator.remove();
            }
        }

        showAllSweet();
        System.out.println("Осортированный по цене");
        System.out.println("-----------------------------------");
        System.out.println("Общая стоимость подарка:  " + showPrice());
        System.out.println("-----------------------------------");
        showWeight();
    }
}