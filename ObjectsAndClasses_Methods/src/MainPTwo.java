public class MainPTwo {

    public static void main(String[] args) {
        Pack pack = new Pack(new Dimensions(1, 2, 3), 10, "Vert 1", false, "12314da", false);

        System.out.println(pack.setDemension(new Dimensions(10, 10 ,10)).setMass(100).setMayUpDown(true).setAdress("novay 10").setRegNumber("0000000F").setGluss(true).toString());
        System.out.println(pack.toString());
    }
}
