package by.tc.task01.entity;

import java.util.Objects;

public class Oven implements Appliance{
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven() {}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Oven oven = (Oven) obj;
        if (Double.compare(oven.powerConsumption, powerConsumption) == 0
                && Double.compare(oven.weight, weight) == 0
                && Double.compare(oven.capacity, capacity) == 0
                && Double.compare(oven.depth, depth) == 0
                && Double.compare(oven.height, height) == 0
                && Double.compare(oven.width, width) == 0)
            return true;
        else
            return false;
    }

    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    public String toString() {
        return "Name: Oven" + "\n Power consumption: " + powerConsumption + "\n Weight: " + weight
                + "\n Capacity: " + capacity + "\n Depth: " + depth +
                "\n Height: " + height + "\n Width: " + width;
    }
}
