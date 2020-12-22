package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner implements Appliance{
    private int powerConsumption;
    private char filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(int powerConsumption,char filterType,String bagType,String wandType,int motorSpeedRegulation,int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner() {}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public char getFilterType() {
        return filterType;
    }

    public void setFilterType(char filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() { return motorSpeedRegulation; }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        VacuumCleaner vacuumCleaner = (VacuumCleaner) obj;
        if (Double.compare(vacuumCleaner.powerConsumption, powerConsumption) == 0
                && Double.compare(vacuumCleaner.filterType, filterType) == 0
                && vacuumCleaner.bagType.equals(bagType)
                && vacuumCleaner.wandType.equals(wandType)
                && Double.compare(vacuumCleaner.motorSpeedRegulation, motorSpeedRegulation) == 0
                && Double.compare(vacuumCleaner.cleaningWidth, cleaningWidth) == 0)
            return true;
        else
            return false;
    }

    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    public String toString() {
        return "Name: Refrigerator" + "\n Power consumption: " + powerConsumption + "\n Filter type: " + filterType
                + "\n Bag type: " + bagType + "\n Wand type: " + wandType +
                "\n Motor speed regulation: " + motorSpeedRegulation + "\n Cleaning width: " + cleaningWidth;
    }
}
