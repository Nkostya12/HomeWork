public class Computer {
    private Processor processor;
    private Ram ram;

    private HardD hardD;

    private Monitor monitor;

    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(String vendor, String name, Processor processor, Ram ram, HardD hardD, Monitor monitor, Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.hardD = hardD;
        this.monitor = monitor;
        this.keyboard = keyboard;

        this.vendor = vendor;
        this.name = name;
    }

    public double getTotalWeigth(){
return processor.getWeight()+ ram.getWeight()+ hardD.getWeight()+ monitor.getWeigth()+ keyboard.getWeigth();
    }

    @Override
    public String toString() {
        return "Производитель - "  +vendor + "\n" +
                "Имя - " + name + "\n" + "\n" +
                processor.toString() +ram.toString()+hardD.toString()+monitor.toString()+keyboard.toString();
    }


    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardD getHardD() {
        return hardD;
    }

    public void setHardD(HardD hardD) {
        this.hardD = hardD;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }
}