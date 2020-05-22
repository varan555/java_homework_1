import sweet.Juice;

public class App {


    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Список сладостей:");
        box.showAllSweet();
        System.out.println("-----------------------------------");

        box.deleteByID( 2);
        System.out.println("Список сладостей после удаления третьего подарка:");
        box.showAllSweet();
        System.out.println("-----------------------------------");

        box.deleteLast();
        System.out.println("Список сладостей после удаления последнего подарка:");
        box.showAllSweet();
        System.out.println("-----------------------------------");

        box.add(new Juice(1.5, "Кола", 1.5, 2.8));
        System.out.println("Список сладостей после добавления сладости:");
        box.showAllSweet();
        System.out.println("-----------------------------------");

        System.out.println("Общий вес подарка:  " + box.showWeight());
        System.out.println("-----------------------------------");
        System.out.println("Общая стоимость подарка:  " +box.showPrice());
        System.out.println("-----------------------------------");

        box.reduceWeight(2.00);
        box.reducePrice(5);

    }
}
