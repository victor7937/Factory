package by.victor.electric.shop.factory.customizers;

import by.victor.electric.shop.devices.DeviceParam;
import by.victor.electric.shop.devices.ElectricDevice;
import by.victor.electric.shop.devices.Speakers;

import java.util.Map;

public class SpeakersCustomizer extends Customizer {

    private Speakers speakers;

    @Override
    public void setDevice(ElectricDevice device) {
        this.speakers = (Speakers) device;
    }

    @Override
    public ElectricDevice getDevice(){
        return speakers;
    }

    @Override
    public void customizeDevice(Map<Enum<?>,Object> param) {
        speakers.setPowerConsumption((Integer) param.get(DeviceParam.Speakers.POWER_CONSUMPTION));
        speakers.setNumberOfSpeakers((Integer) param.get(DeviceParam.Speakers.NUMBER_OF_SPEAKERS));
        speakers.setFrequencyRange((String) param.get(DeviceParam.Speakers.FREQUENCY_RANGE));
        speakers.setCordLength((Integer) param.get(DeviceParam.Speakers.CORD_LENGTH));
    }
}
