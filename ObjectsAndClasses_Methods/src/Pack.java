public class Pack {
    private final Dimensions dimensions;
    private final int weightPack;

    private final String address
            ;

    private final boolean mayUpDown;

    private final String regNumber;

    private final boolean fragility;

    public Pack(Dimensions dimensions, int weightPack, String address, boolean mayUpDown, String regNumber, boolean fragility) {
        this.dimensions = dimensions;
        this.weightPack = weightPack;
        this.address = address;
        this.mayUpDown = mayUpDown;
        this.regNumber = regNumber;
        this.fragility = fragility;
    }

    public Pack setDemension(Dimensions dimensions) {
        return new Pack(dimensions, weightPack, address, mayUpDown, regNumber, fragility);
    }

    public Pack setWeightPack(int weightPack) {
        return new Pack(dimensions, weightPack, address, mayUpDown, regNumber, fragility);
    }

    public Pack setAddress(String address) {
        return new Pack(dimensions, weightPack, address, mayUpDown, regNumber, fragility);
    }

    public Pack setMayUpDown(boolean mayUpDown) {
        return new Pack(dimensions, weightPack, address, mayUpDown, regNumber, fragility);
    }

    public Pack setRegNumber(String regNumber) {
        return new Pack(dimensions, weightPack, address, mayUpDown, regNumber, fragility);
    }

    public Pack setFragility(boolean fragility) {
        return new Pack(dimensions, weightPack, address, mayUpDown, regNumber, fragility);
    }

    @Override
    public String toString() {
        return "габариты: " + dimensions.toString() + "\n" +
                "масса: " + weightPack + "\n" +
                "адрес: " + address + "\n" +
                "свойства: " + mayUpDown + "\n" +
                "рег.номер: " + regNumber + "\n" +
                "стеклянность: " + fragility + "\n";
    }
}