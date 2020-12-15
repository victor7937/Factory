package by.victor.electric.shop.factory.customizers;
import by.victor.electric.shop.devices.ElectricDevice;

import java.util.Map;

public abstract class Customizer {

    public abstract void setDevice(ElectricDevice device);
    public abstract ElectricDevice getDevice();
    public abstract void customizeDevice(Map<Enum<?>,Object> param);

}
