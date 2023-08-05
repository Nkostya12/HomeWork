public class BasketMain {
    public static void main(String[] args) {
        Basket basketTwo = new Basket();
        basketTwo.add("milk", 10, 1, 10);
        basketTwo.add("beer",10, 1,10);
        basketTwo.add("bread",10, 1,10);
        basketTwo.add("wine",10, 1, 10);
        basketTwo.add("soup", 10, 1, 10);
        basketTwo.add("sop", 10, 1, 10);
        basketTwo.add("upo", 10,1 ,10);
        basketTwo.add("uo", 10,1,10);

        basketTwo.add("jw", 10,1);
        basketTwo.add("iu", 10);
        basketTwo.print("rfr");



        Basket basket = new Basket();
        basket.add("milk", 100, 1, 10);
        basket.add("beer",100, 1,10);
        basket.add("bread",100, 1,10);
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
        System.out.println("вторая корзина " + basketTwo.getTotalPrice());


        System.out.println(Basket.getTotalCount());
        System.out.println(Basket.averagePrice());

    }


}


