public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("milk", 20, 1, 10);
        basket.add("beer",50, 2);
        basket.add("bread",50, 2);
        basket.add("wine",50, 2);
        basket.add("soup", 20, 2, 15);
        basket.print("rfr");

        System.out.println("вес общий " + basket.getTotalWeight());
        System.out.println("стоимость "  + basket.getTotalPrice());

    }


}
