public class Ram {

    private final RamType ramType;
    private final int ramMemory;

    private double weight;

    public Ram(RamType ramType, int ramMemory, double weight) {
        this.ramMemory = ramMemory;
        this.ramType = ramType;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Оперативная память - " + "\n"+
                "Тип: " + ramType + "\n" +
                "Вес: " + weight + "\n";
    }
}
