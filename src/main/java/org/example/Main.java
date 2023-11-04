package org.example;

public class Main {
    public static void main(String[] args) {
        ToyRaffle toyRaffle = new ToyRaffle();

        toyRaffle.put("1 конструктор 2");
        toyRaffle.put("2 робот 2");
        toyRaffle.put("3 кукла 6");

        toyRaffle.runRaffle();
    }
}