package by.victor.electric.shop.devices;

public class TabletPC extends ElectricDevice {

    public TabletPC (){}

    private Integer batteryCapacity;
    private Integer displayInches;
    private Integer memoryRom;
    private Integer flashMemoryCapacity;
    private String color;

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayInches(Integer displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryRom(Integer memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setFlashMemoryCapacity(Integer flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
