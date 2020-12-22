package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator implements Appliance{
    private int powerConsumption;
    private double freezerCapacity;
    private int overallCapacity;
    private int weight;
    private int height;
    private int width;

    public Refrigerator(int powerConsumption, double freezerCapacity, int overallCapacity, int weight, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public Refrigerator() {}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Refrigerator refrigerator = (Refrigerator) obj;
        if (Double.compare(refrigerator.powerConsumption, powerConsumption) == 0
                && Double.compare(refrigerator.weight, weight) == 0
                && Double.compare(refrigerator.freezerCapacity, freezerCapacity) == 0
                && Double.compare(refrigerator.overallCapacity, overallCapacity) == 0
                && Double.compare(refrigerator.height, height) == 0
                && Double.compare(refrigerator.width, width) == 0)
            return true;
        else
            return false;
    }

    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    public String toString() {
        return "Name: Refrigerator" + "\n Power consumption: " + powerConsumption + "\n Weight: " + weight
                + "\n Freezer capacity: " + freezerCapacity + "\n Overall capacity: " + overallCapacity +
                "\n Height: " + height + "\n Width: " + width;
    }
}
