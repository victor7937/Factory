package by.victor.electric.shop.factory.customizers;

import by.victor.electric.shop.devices.DeviceParam;
import by.victor.electric.shop.devices.ElectricDevice;
import by.victor.electric.shop.devices.VacuumCleaner;

import java.util.Map;

public class VacuumCleanerCustomizer extends Customizer {
    private VacuumCleaner vacuumCleaner;

    @Override
    public void setDevice(ElectricDevice device) {
        this.vacuumCleaner = (VacuumCleaner) device;
    }

    @Override
    public ElectricDevice getDevice(){
        return vacuumCleaner;
    }

    @Override
    public void customizeDevice(Map<Enum<?>,Object> param) {
        vacuumCleaner.setPowerConsumption((Integer) param.get(DeviceParam.VacuumCleaner.POWER_CONSUMPTION));
        vacuumCleaner.setFilterType((String) param.get(DeviceParam.VacuumCleaner.FILTER_TYPE));
        vacuumCleaner.setBagType((String) param.get(DeviceParam.VacuumCleaner.BAG_TYPE));
        vacuumCleaner.setWandType((String) param.get(DeviceParam.VacuumCleaner.WAND_TYPE));
        vacuumCleaner.setMotorSpeedRegulation((Integer) param.get(DeviceParam.VacuumCleaner.MOTOR_SPEED_REGULATION));
        vacuumCleaner.setCleaningWidth((Integer) param.get(DeviceParam.VacuumCleaner.CLEANING_WIDTH));
    }

}
