public class Monitor {
private final int diagonal;

private final  TypeMonitor typeMonitor;

private final double weigth;

public Monitor(int diagonal, TypeMonitor typeMonitor, double weigth){
    this.typeMonitor = typeMonitor;
    this.diagonal = diagonal;
    this.weigth =weigth;
}
public double getWeigth(){
    return weigth;

}

    @Override
    public String toString() {
        return "Монитор - " + "\n"+
                "Тип: " + typeMonitor + "\n"+
                "Вес: " + weigth + "\n"
                ;
    }
}
