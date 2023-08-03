public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("milk", 10, 1, 10);
        basket.add("beer",10, 1,10);
        basket.add("bread",10, 1,10);
        basket.add("wine",10, 1, 10);
        basket.add("soup", 10, 1, 10);
        basket.add("sop", 10, 1, 10);
        basket.add("upo", 10,1 ,10);
        basket.add("uo", 10,1,10);

        basket.add("jw", 10,1);
        basket.add("iu", 10);
        basket.print("rfr");

        System.out.println("вес общий " + basket.getTotalWeight());
        System.out.println("стоимость "  + basket.getTotalPrice());

    }


}
