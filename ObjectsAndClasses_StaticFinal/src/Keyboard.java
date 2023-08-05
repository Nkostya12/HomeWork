public class Keyboard {
    private final TypeKey typeKey;
    private final Led led;

    private final double weigth;

    public Keyboard( TypeKey typeKey, Led led, double weigth){
        this.typeKey = typeKey;
        this.led = led;
        this.weigth = weigth;
    }
public double getWeigth(){
        return weigth;
}

    @Override
    public String toString() {
        return "Клавиатура - " + "\n" +
                "Тип: " + typeKey +"\n" +
                "Подсветка: " + led + "\n"+
                "Вес: " + weigth + "\n";
    }
}
