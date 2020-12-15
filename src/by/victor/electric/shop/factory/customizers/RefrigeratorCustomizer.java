package by.victor.electric.shop.factory.customizers;

import by.victor.electric.shop.devices.DeviceParam;
import by.victor.electric.shop.devices.ElectricDevice;
import by.victor.electric.shop.devices.Refrigerator;

import java.util.Map;

public class RefrigeratorCustomizer extends Customizer{
    private Refrigerator refrigerator;

    @Override
    public void setDevice(ElectricDevice device) {
        this.refrigerator = (Refrigerator) device;
    }

    @Override
    public ElectricDevice getDevice(){
        return refrigerator;
    }

    @Override
    public void customizeDevice(Map<Enum<?>,Object> param) {
        refrigerator.setPowerConsumption((Integer) param.get(DeviceParam.Refrigerator.POWER_CONSUMPTION));
        refrigerator.setWeight((Integer) param.get(DeviceParam.Refrigerator.WEIGHT));
        refrigerator.setFreezerCapacity((Integer) param.get(DeviceParam.Refrigerator.FREEZER_CAPACITY));
        refrigerator.setOverallCapacity((Double) param.get(DeviceParam.Refrigerator.OVERALL_CAPACITY));
        refrigerator.setHeight((Integer) param.get(DeviceParam.Refrigerator.HEIGHT));
        refrigerator.setWidth((Integer) param.get(DeviceParam.Refrigerator.WIDTH));
    }
}
