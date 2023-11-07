package org.example;

public class Toy {
    private int toyId;
    private String toyName;
    private int countToys; // количество
    private double frequency; // частота выпадения


    public Toy(int toyId, String toyName, int countToys) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.countToys = countToys;

    }


    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public int getCountToys() {
        return countToys;
    }

    public void setCountToys(int countToys) {
        this.countToys = countToys;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "ID:" + toyId +
                ", наименование: '" + toyName + '\'' +
                ", количество: " + countToys +
                ", частота выпадения" + frequency;
    }
}
