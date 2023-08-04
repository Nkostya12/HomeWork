public class Dimensions {
    private final int shirina;
    private final int vusota;

    private final int dlina;

    public Dimensions(int shirina, int vusota, int dlina) {
        this.shirina = shirina;
        this.vusota = vusota;
        this.dlina = dlina;
    }

    public int obuom (int shirina, int vusota, int dlina) {
        return shirina * vusota * dlina;
    }

    @Override
    public String toString() {
        return "\n" + "высота: " + vusota +"\n"+
                "ширина: " + shirina + "\n" +
                "длина: " + dlina + "\n";
    }
}
