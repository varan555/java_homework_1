public class App {


    public static void main(String[] args) {
        Box box = new Box();
        box.creatPresent();
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
        System.out.println("Общий вес подарка:  " + box.showWeight());
        System.out.println("-----------------------------------");
        System.out.println("Общая стоимость подарка:  " +box.showPrice());
        box.reduceWeight(1.00);
        box.reducePrice(3);

    }
}
