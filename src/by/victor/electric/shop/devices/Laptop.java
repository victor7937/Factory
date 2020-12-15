package by.victor.electric.shop.devices;

public class Laptop extends ElectricDevice {
    public Laptop (){}
    private Integer batteryCapacity;
    private String os;
    private Integer memoryRom;
    private Integer systemMemory;
    private Double cpu;
    private Integer displayInchs;

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemoryRom(Integer memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(Integer systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInchs(Integer displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                '}';
    }
}
