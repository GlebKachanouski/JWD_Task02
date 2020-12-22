package by.tc.task01.StoreFactory;

import by.tc.task01.entity.*;

import java.util.HashMap;

public class ApplianceStore extends Store{
    Appliance createElectronics(String type, HashMap<String, Object> requirements) {
        switch (type) {
            case "Laptop":
                return new Laptop((double) requirements.get("BATTERY_CAPACITY"), (String) requirements.get("OS"),
                        (int) requirements.get("MEMORY_ROM"), (int) requirements.get("SYSTEM_MEMORY"),
                        (double) requirements.get("CPU"), (int) requirements.get("DISPLAY_INCHS"));
            case "Refrigerator":
                return new Refrigerator((int) requirements.get("POWER_CONSUMPTION"),
                        (double) requirements.get("FREEZER_CAPACITY"), (int) requirements.get("OVERALL_CAPACITY"),
                        (int) requirements.get("WEIGHT"), (int) requirements.get("HEIGHT"),
                        (int) requirements.get("WIDTH"));
            case "Oven":
                return new Oven((int) requirements.get("POWER_CONSUMPTION"), (int) requirements.get("WEIGHT"),
                        (int) requirements.get("CAPACITY"), (int) requirements.get("DEPTH"),
                        (double) requirements.get("HEIGHT"), (double) requirements.get("WIDTH"));
            case "Speakers":
                return new Speakers((int) requirements.get("POWER_CONSUMPTION"), (int) requirements.get("NUMBER_OF_SPEAKERS"),
                        (String) requirements.get("FREQUENCY_RANGE"), (int) requirements.get("CORD_LENGTH"));
            case "TabletPC":
                return new TabletPC((int) requirements.get("BATTERY_CAPACITY"), (int) requirements.get("DISPLAY_INCHES"),
                        (int) requirements.get("MEMORY_ROM"), (int) requirements.get("FLASH_MEMORY_CAPACITY"),
                        (String) requirements.get("COLOR"));
            case "VacuumCleaner":
                return new VacuumCleaner((int) requirements.get("POWER_CONSUMPTION"), (char) requirements.get("FILTER_TYPE"),
                        (String) requirements.get("BAG_TYPE"), (String) requirements.get("BAG_TYPE"),
                        (int) requirements.get("MOTOR_SPEED_REGULATION"), (int) requirements.get("CLEANING_WIDTH"));
            default:
                return null;
        }
    }
}
