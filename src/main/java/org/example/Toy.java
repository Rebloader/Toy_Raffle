package org.example;

public class Toy {
    private String toyId;
    private String toyName;
    private int frequency;


    public Toy(String toyId, String toyName, int frequency) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.frequency = frequency;
    }

    public String getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public int getFrequency() {
        return frequency;
    }

}
