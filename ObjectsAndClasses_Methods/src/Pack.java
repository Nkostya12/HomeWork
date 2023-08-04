public class Pack {
    private final Dimensions dimensions;
    private final int mass;

    private final String adress;

    private final boolean mayUpDown;

    private final String regNumber;

    private final boolean gluss;

    public Pack(Dimensions dimensions, int mass, String adress, boolean mayUpDown, String regNumber, boolean gluss) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.adress = adress;
        this.mayUpDown = mayUpDown;
        this.regNumber = regNumber;
        this.gluss = gluss;
    }

    public Pack setDemension(Dimensions dimensions) {
        return new Pack(dimensions, mass, adress, mayUpDown, regNumber, gluss);
    }

    public Pack setMass(int mass) {
        return new Pack(dimensions, mass, adress, mayUpDown, regNumber, gluss);
    }

    public Pack setAdress(String adress) {
        return new Pack(dimensions, mass, adress, mayUpDown, regNumber, gluss);
    }

    public Pack setMayUpDown(boolean mayUpDown) {
        return new Pack(dimensions, mass, adress, mayUpDown, regNumber, gluss);
    }

    public Pack setRegNumber(String regNumber) {
        return new Pack(dimensions, mass, adress, mayUpDown, regNumber, gluss);
    }

    public Pack setGluss(boolean gluss) {
        return new Pack(dimensions, mass, adress, mayUpDown, regNumber, gluss);
    }

    @Override
    public String toString() {
        return "габариты: " + dimensions.toString() + "\n" +
                "масса: " +  mass + "\n" +
                "адрес: " + adress + "\n" +
                "свойства: " + mayUpDown + "\n" +
                "рег.номер: " + regNumber + "\n" +
                "стеклянность: " + gluss + "\n";
    }
}