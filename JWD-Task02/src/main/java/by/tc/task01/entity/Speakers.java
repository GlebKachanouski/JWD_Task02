package by.tc.task01.entity;

import java.util.Objects;

public class Speakers implements Appliance{
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers(int powerConsumption,int numberOfSpeakers,String frequencyRange,int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Speakers() {}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Speakers speakers = (Speakers) obj;
        if (Double.compare(speakers.powerConsumption, powerConsumption) == 0
                && Double.compare(speakers.numberOfSpeakers, numberOfSpeakers) == 0
                && speakers.frequencyRange.equals(frequencyRange)
                && Double.compare(speakers.cordLength, cordLength) == 0)
            return true;
        else
            return false;
    }

    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    public String toString() {
        return "Name: Refrigerator" + "\n Power consumption: " + powerConsumption + "\n Number of speakers: " + numberOfSpeakers
                + "\n Frequency range: " + frequencyRange + "\n Cord length: " + cordLength;
    }
}
