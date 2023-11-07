package org.example;

import java.util.*;

public class ToyRaffle {
    private List<Toy> toys = new ArrayList<>();
    private WinnerWriter winnerWriter;
    private int totalToysCount = 0;


    public ToyRaffle(WinnerWriter winnerWriter) {
        this.winnerWriter = winnerWriter;
    }

    public void putToy(Toy toy) {
        toys.add(toy);
        totalToysCount += toy.getCountToys();
        calculateFrequency();
    }

    public void changeToyCount(int toyId, int newCount) {
        for (Toy toy : toys) {
            if (toy.getToyId() == toyId) {
                toy.setCountToys(newCount);
                return;
            }
        }
    }

    public List<Toy> showAllToys() {
        return toys;
    }

    public Toy runRaffle() {
        double totalFrequency = toys.stream().mapToDouble(Toy::getFrequency).sum();
        double randomValue = Math.random() * totalFrequency;

        for (Toy toy : toys) {
            randomValue -= toy.getFrequency();
            if (randomValue <= 0) {
                Toy prizeToy = toy;
                removeToy(toy);
                winnerWriter.writeWinner(prizeToy);
                return prizeToy;
            }
        }

        if (toys.isEmpty()) {
            System.out.println("Игрушки кончились.");
            return null;
        }
        return null;
    }
    public void removeToy(Toy toy) {
        toys.remove(toy);
        toy.setCountToys(toy.getCountToys() - 1);
    }

    public void calculateFrequency() {
        for (Toy toy : toys) {
            toy.setFrequency((double) toy.getCountToys() / totalToysCount * 100);
        }
    }
}

