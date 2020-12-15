package by.victor.electric.shop.factory.customizers;

import by.victor.electric.shop.devices.DeviceParam;
import by.victor.electric.shop.devices.ElectricDevice;
import by.victor.electric.shop.devices.TabletPC;

import java.util.Map;

public class TabletPCCustomizer extends Customizer{
    private TabletPC tabletPC;

    @Override
    public void setDevice(ElectricDevice device) {
        this.tabletPC = (TabletPC) device;
    }

    @Override
    public ElectricDevice getDevice(){
        return tabletPC;
    }

    @Override
    public void customizeDevice(Map<Enum<?>,Object> param) {
        tabletPC.setBatteryCapacity((Integer) param.get(DeviceParam.TabletPC.BATTERY_CAPACITY));
        tabletPC.setDisplayInches((Integer) param.get(DeviceParam.TabletPC.DISPLAY_INCHES));
        tabletPC.setMemoryRom((Integer) param.get(DeviceParam.TabletPC.MEMORY_ROM));
        tabletPC.setFlashMemoryCapacity((Integer) param.get(DeviceParam.TabletPC.FLASH_MEMORY_CAPACITY));
        tabletPC.setColor((String) param.get(DeviceParam.TabletPC.COLOR));
    }

}
