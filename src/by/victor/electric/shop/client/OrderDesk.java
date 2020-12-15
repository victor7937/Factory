package by.victor.electric.shop.client;

import by.victor.electric.shop.devices.DeviceParam.*;
import by.victor.electric.shop.factory.ElectricDeviceFactory;
import by.victor.electric.shop.devices.ElectricDevice;
import by.victor.electric.shop.devices.DeviceType;


import java.util.Map;

public class OrderDesk {
    public static void main(String[] args) {
        ElectricDeviceFactory factory = new ElectricDeviceFactory();

        Map<Enum<?>,Object> param1 = Map.of(Oven.WIDTH,12.2, Oven.CAPACITY,32,
                Oven.DEPTH,60, Oven.HEIGHT,45.5, Oven.POWER_CONSUMPTION,1000,
                Oven.WEIGHT,10);
        ElectricDevice device = factory.produce(DeviceType.OVEN,param1);
        System.out.println(device);

        Map<Enum<?>,Object> param2 = Map.of(Laptop.BATTERY_CAPACITY,1, Laptop.OS, "Windows",
                Laptop.MEMORY_ROM,4000, Laptop.SYSTEM_MEMORY,1000, Laptop.CPU,1.2,
                Laptop.DISPLAY_INCHS,18);
        device = factory.produce(DeviceType.LAPTOP,param2);
        System.out.println(device);

        Map<Enum<?>,Object> param3 = Map.of(Refrigerator.POWER_CONSUMPTION, 100,
                Refrigerator.WEIGHT,20, Refrigerator.FREEZER_CAPACITY,10,
                Refrigerator.OVERALL_CAPACITY,300.0, Refrigerator.HEIGHT,200,
                Refrigerator.WIDTH,70);
        device = factory.produce(DeviceType.REFRIGERATOR,param3);
        System.out.println(device);

        Map<Enum<?>,Object> param4 = Map.of(Speakers.POWER_CONSUMPTION,15,
                Speakers.NUMBER_OF_SPEAKERS,2, Speakers.FREQUENCY_RANGE, "2-4",
                Speakers.CORD_LENGTH,2);
        device = factory.produce(DeviceType.SPEAKERS,param4);
        System.out.println(device);

        Map<Enum<?>,Object> param5 = Map.of(VacuumCleaner.POWER_CONSUMPTION,100,
                VacuumCleaner.FILTER_TYPE,"A", VacuumCleaner.BAG_TYPE,"A2",
                VacuumCleaner.WAND_TYPE,"all-in-one",
                VacuumCleaner.MOTOR_SPEED_REGULATION,3000,VacuumCleaner.CLEANING_WIDTH,20);
        device = factory.produce(DeviceType.VACUUMCLEANER,param5);
        System.out.println(device);

        Map<Enum<?>,Object> param6 = Map.of(TabletPC.BATTERY_CAPACITY,3,
                TabletPC.DISPLAY_INCHES,14, TabletPC.MEMORY_ROM,8000,
                TabletPC.FLASH_MEMORY_CAPACITY,2,TabletPC.COLOR,"blue");
        device = factory.produce(DeviceType.TABLETPC,param6);
        System.out.println(device);


    }
}
