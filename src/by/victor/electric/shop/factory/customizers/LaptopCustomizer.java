package by.victor.electric.shop.factory.customizers;

import by.victor.electric.shop.devices.DeviceParam;
import by.victor.electric.shop.devices.ElectricDevice;
import by.victor.electric.shop.devices.Laptop;

import java.util.Map;

public class LaptopCustomizer extends Customizer {

    private Laptop laptop;

    @Override
    public void setDevice(ElectricDevice device) {
        this.laptop = (Laptop)device;
    }

    @Override
    public ElectricDevice getDevice() {
        return laptop;
    }

    @Override
    public void customizeDevice(Map<Enum<?>, Object> param) {
        laptop.setBatteryCapacity((Integer)param.get(DeviceParam.Laptop.BATTERY_CAPACITY));
        laptop.setOs((String) param.get(DeviceParam.Laptop.OS));
        laptop.setMemoryRom((Integer)param.get(DeviceParam.Laptop.MEMORY_ROM));
        laptop.setSystemMemory((Integer)param.get(DeviceParam.Laptop.SYSTEM_MEMORY));
        laptop.setCpu((Double) param.get(DeviceParam.Laptop.CPU));
        laptop.setDisplayInchs((Integer)param.get(DeviceParam.Laptop.DISPLAY_INCHS));
    }
}
