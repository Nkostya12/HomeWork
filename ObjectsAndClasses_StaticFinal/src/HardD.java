public class HardD {
private final TypeHard typeHard;
private final int memory;

private final double weight;

public HardD(TypeHard typeHard, int memory, double weight ){
    this.memory=memory;
    this.typeHard = typeHard;
    this.weight = weight;
}
public double getWeight(){
    return weight;
}

    @Override
    public String toString() {
        return "Накопитель - " + "\n" +
                "Память: " + "\n" + memory + "\n" +
                        "Тип: " + typeHard + "\n" +
                        "Вес: " + weight + "\n"
                ;
    }
}
