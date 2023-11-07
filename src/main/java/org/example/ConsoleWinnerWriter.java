package org.example;

public class ConsoleWinnerWriter implements WinnerWriter{
    public void writeWinner(Toy toy) {
        System.out.println("Writing to the console: " + toy.getToyName());
    }
}
