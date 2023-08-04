public class Dimensions {
    private final int width;
    private final int height;

    private final int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int obuom (int width, int height, int length) {
        return height * height * length;
    }

    @Override
    public String toString() {
        return "\n" + "высота: " + height +"\n"+
                "ширина: " + width + "\n" +
                "длина: " + length + "\n";
    }
}
