package by.victor.electric.shop.factory;

import by.victor.electric.shop.factory.customizers.*;
import by.victor.electric.shop.devices.*;
import static by.victor.electric.shop.devices.DeviceType.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;



public class ElectricDeviceFactory {

    private static final Map<DeviceType, Supplier<ElectricDevice>> templates = new HashMap<>();
    private static final Map<DeviceType, Supplier<Customizer>> customizers = new HashMap<>();

    static {
        templates.put(OVEN, Oven::new);
        templates.put(LAPTOP, Laptop::new);
        templates.put(REFRIGERATOR, Refrigerator::new);
        templates.put(VACUUMCLEANER, VacuumCleaner::new);
        templates.put(TABLETPC, TabletPC::new);
        templates.put(SPEAKERS, Speakers::new);

        customizers.put(OVEN, OvenCustomizer::new);
        customizers.put(LAPTOP, LaptopCustomizer::new);
        customizers.put(REFRIGERATOR, RefrigeratorCustomizer::new);
        customizers.put(VACUUMCLEANER, VacuumCleanerCustomizer::new);
        customizers.put(TABLETPC, TabletPCCustomizer::new);
        customizers.put(SPEAKERS, SpeakersCustomizer::new);

    }

    private ElectricDevice produceTemplate(DeviceType deviceType){
        Supplier<ElectricDevice> supplier = templates.get(deviceType);
        return supplier != null ? supplier.get() : null;
    }

    private Customizer getCustomizer(DeviceType deviceType){
        Supplier<Customizer> supplier = customizers.get(deviceType);
        return supplier != null ? supplier.get() : null;
    }

    public ElectricDevice produce (DeviceType deviceType, Map<Enum<?>,Object> param) {
        ElectricDevice template = produceTemplate(deviceType);
        Customizer customizer = getCustomizer(deviceType);
        if(customizer != null && template != null) {
            customizer.setDevice(template);
            customizer.customizeDevice(param);
            return customizer.getDevice();
        }
        else return null;
    }
}
