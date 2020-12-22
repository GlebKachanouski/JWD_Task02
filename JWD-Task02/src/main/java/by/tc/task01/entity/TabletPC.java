package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC implements Appliance{
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC(int batteryCapacity,int displayInches,int memoryRom,int flashMemoryCapacity,String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC() {}

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        TabletPC tabletPC = (TabletPC) obj;
        if (Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
                && Double.compare(tabletPC.memoryRom, memoryRom) == 0
                && tabletPC.color.equals(color)
                && Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0
                && Double.compare(tabletPC.displayInches, displayInches) == 0)
            return true;
        else
            return false;
    }

    public int hashCode() {
        return Objects.hash(batteryCapacity, color, memoryRom, flashMemoryCapacity, displayInches);
    }

    public String toString() {
        return "Name: TablePC" + "\n Battery capacity: " + batteryCapacity + "\n Display inches: " + displayInches
                + "\n Memory ROM: " + memoryRom + "\n Flash memory capacity: " + flashMemoryCapacity +
                "\n Color: " + color;
    }
}
