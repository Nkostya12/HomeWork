public class Main {
    public static void main(String[] args) {
        Processor processorVasya = new Processor(2.4, 16, Vendor.AMD, 20);
        Ram ramVasya = new Ram(RamType.DDR3, 1024, 20);
        HardD hardDVasya = new HardD(TypeHard.HDD, 1024, 20);
        Monitor monitorVasya = new Monitor(24, TypeMonitor.VA, 20);
        Keyboard keyboardVasya = new Keyboard(TypeKey.MEMBRANA, Led.NO, 20);


        Processor changeProcessor = new Processor(3.6, 32, Vendor.INTEL, 50);


        Computer computerVasya = new Computer("Vasya", "Vasiliu", processorVasya, ramVasya, hardDVasya, monitorVasya, keyboardVasya);
        System.out.println(computerVasya.toString());
        System.out.println(computerVasya.getProcessor());
        computerVasya.setProcessor(changeProcessor);
        System.out.println(computerVasya.getProcessor());
        System.out.println(computerVasya.toString());


        Computer computerKostya = new Computer("Kostya", "Konstantin", new Processor(1.8, 4, Vendor.INTEL, 10), new Ram(RamType.DDR5, 1024, 10), new HardD(TypeHard.SSD, 2048, 10), new Monitor(15, TypeMonitor.IPS, 10), new Keyboard(TypeKey.MEHANICA, Led.YES, 10));

        System.out.println(computerKostya.getTotalWeigth());
        System.out.println(computerKostya.toString());


    }
}
