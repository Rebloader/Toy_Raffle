package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToyRaffle {
    private Queue<Toy> toyQueue;
    Random random;

    public ToyRaffle() {
        toyQueue = new PriorityQueue<>((t1, t2) -> t2.getFrequency() - t1.getFrequency());
        random = new Random();
    }

    public void put(String input) {
        String[] parts = input.split(" ");
        if (parts.length == 3) {
            String id = parts[0];
            String name = parts[1];
            int frequency = Integer.parseInt(parts[2]);
            Toy toy = new Toy(id, name, frequency);
            toyQueue.offer(toy);
        }
    }

    public String get() {
        int randomNumber = random.nextInt(101);
        if (randomNumber <= 20) {
            return "1";
        } else if (randomNumber <= 40) {
            return "2";
        } else {
            Toy toy = toyQueue.poll();
            if (toy != null) {
                return toy.getToyId();
            }
        }
        return null;
    }

    public void runRaffle() {
        try (FileWriter writer = new FileWriter("results.txt")) {
            for (int i = 0; i < 10; i++) {
                Toy toy = toyQueue.poll();
                if (toy != null) {
                    writer.write("Winner: " + toy.getToyName() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
