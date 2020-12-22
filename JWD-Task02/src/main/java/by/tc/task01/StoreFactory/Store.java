package by.tc.task01.StoreFactory;

import by.tc.task01.entity.Appliance;

import java.util.HashMap;

public abstract class Store {

    public Appliance orderElectronics(String type, HashMap<String, Object> requirements) {
        Appliance electronics;
        electronics = createElectronics(type, requirements);
        return electronics;
    }

    abstract Appliance createElectronics(String type, HashMap<String, Object> requirements);
}



