package by.victor.electric.shop.devices;


public class Speakers extends ElectricDevice {

    public Speakers(){}

    private Integer powerConsumption;
    private Integer numberOfSpeakers;
    private String frequencyRange;
    private Integer cordLength;

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(Integer numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public void setCordLength(Integer cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength +
                '}';
    }
}
