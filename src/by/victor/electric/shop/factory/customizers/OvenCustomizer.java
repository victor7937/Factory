package by.victor.electric.shop.factory.customizers;

import by.victor.electric.shop.devices.DeviceParam;
import by.victor.electric.shop.devices.ElectricDevice;
import by.victor.electric.shop.devices.Oven;

import java.util.Map;

public class OvenCustomizer extends Customizer{
    private Oven oven;

    @Override
    public void setDevice(ElectricDevice device) {
        this.oven = (Oven)device;
    }

    @Override
    public ElectricDevice getDevice(){
        return oven;
    }

    @Override
    public void customizeDevice(Map<Enum<?>,Object> param) {
        oven.setPowerConsumption((Integer) param.get(DeviceParam.Oven.POWER_CONSUMPTION));
        oven.setWeight((Integer) param.get(DeviceParam.Oven.WEIGHT));
        oven.setCapacity((Integer) param.get(DeviceParam.Oven.CAPACITY));
        oven.setDepth((Integer) param.get(DeviceParam.Oven.DEPTH));
        oven.setHeight((Double) param.get(DeviceParam.Oven.HEIGHT));
        oven.setWidth((Double) param.get(DeviceParam.Oven.WIDTH));
    }

}
