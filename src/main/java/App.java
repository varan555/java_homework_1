public class App {

    public static void main(String[] args) {
        Box box = new Box();
        box.creatPresent();
        System.out.println("Список сладостей:");
        box.showAllSweet(box.getPresent());
        System.out.println("-----------------------------------");
        box.deleteByID.deleteByID(box.getPresent(), 2);

        System.out.println("Список сладостей после применения лямбды и удаления третьего подарка:");
        box.showAllSweet(box.getPresent());
        System.out.println("-----------------------------------");
        box.showWeight(box.getPresent());
        System.out.println("-----------------------------------");
        box.showPrice(box.getPresent());

    }
}
