public class App {


    public static void main(String[] args) {
        Box box = new Box();
        box.creatPresent();
        System.out.println("Список сладостей:");
        box.showAllSweet(box.getPresent());
        System.out.println("-----------------------------------");
        box.deleteByID(box.getPresent(), 2);

        System.out.println("Список сладостей после удаления третьего подарка:");
        box.showAllSweet(box.getPresent());
        System.out.println("-----------------------------------");
        box.deleteLast(box.getPresent());
        System.out.println("Список сладостей после удаления последнего подарка:");
        box.showAllSweet(box.getPresent());
        System.out.println("-----------------------------------");
        System.out.println("Общий вес подарка:  " + box.showWeight(box.getPresent()));
        System.out.println("-----------------------------------");
        System.out.println("Общая стоимость подарка:  " +box.showPrice(box.getPresent()));
        box.reduceWeight(1.00, box);
        box.reducePrice(3, box);

    }
}
