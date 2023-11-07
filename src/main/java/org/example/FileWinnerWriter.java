package org.example;

import java.io.IOException;
import java.io.FileWriter;

public class FileWinnerWriter implements WinnerWriter{
    private String path = "result.txt";

    @Override
    public void writeWinner(Toy toy) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write("Winner: " + toy.getToyName() + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
