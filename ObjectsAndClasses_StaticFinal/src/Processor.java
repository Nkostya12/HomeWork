public class Processor {

    private final double mgz;
    private final int countCore;

    private final double  weight;

    public Processor(double mgz, int countCore, Vendor vendor, double weight) {
        this.mgz = mgz;
        this.countCore = countCore;
        this.weight = weight;
    }
public double getWeight(){
        return  weight;
}

    @Override
    public String toString() {
        return "Процессор - " + "\n" +
                "Частота: " + mgz + "\n" +
                "Количество ядер: " + countCore + "\n"+
                "Вес: " + weight + "\n"
                ;
    }
}
