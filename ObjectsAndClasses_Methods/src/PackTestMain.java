public class PackTestMain {

    public static void main(String[] args) {
        Pack pack = new Pack(new Dimensions(1, 2, 3), 10, "Vert 1", false, "12314da", false);
        System.out.println(pack.toString());
        System.out.println(pack.setWeightPack(1000));
        System.out.println(pack.setRegNumber("7777777F"));
        System.out.println(pack.setDemension(new Dimensions(10, 10 ,10)).setWeightPack(100).setMayUpDown(true).setAddress("novay 10").setRegNumber("0000000F").setFragility(true).toString());
        System.out.println(pack.toString());

    }
}
