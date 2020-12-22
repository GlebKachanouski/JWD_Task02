package by.tc.task01.entity;

import java.util.Objects;

public class Laptop implements Appliance {
    private double batteryCapacity;
    private String OS;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    public Laptop(double batteryCapacity,String OS,int memoryRom,int systemMemory,double cpu,int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryRom= memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public Laptop() {}

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Laptop laptop = (Laptop) obj;
        if (Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
                && Double.compare(laptop.memoryRom, memoryRom) == 0
                && Double.compare(laptop.systemMemory, systemMemory) == 0
                && Double.compare(laptop.cpu, cpu) == 0
                && Double.compare(laptop.displayInches, displayInches) == 0
                && laptop.OS.equals(OS))
            return true;
        else
            return false;
    }

    public int hashCode() {
        return Objects.hash(batteryCapacity, OS, memoryRom, systemMemory, cpu, displayInches);
    }

    public String toString() {
        return "Name: Laptop " + "\n Battery capacity: " + batteryCapacity + "\n OS: " + OS
                +"\n Memory ROM: " + memoryRom + "\n System memory: "+ systemMemory +
                "\n CPU: " + cpu + "\n Display inches: " + displayInches;
    }
}
