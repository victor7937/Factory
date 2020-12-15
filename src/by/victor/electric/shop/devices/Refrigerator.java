package by.victor.electric.shop.devices;

public class Refrigerator extends ElectricDevice {

    public Refrigerator (){}

    private Integer powerConsumption;
    private Integer weight;
    private Integer freezerCapacity;
    private Double overallCapacity;
    private Integer height;
    private Integer width;

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(Integer freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
