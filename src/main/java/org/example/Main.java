package org.example;

public class Main {
    public static void main(String[] args) {
        WinnerWriter fileWinnerWriter = new FileWinnerWriter();
        ToyRaffle store = new ToyRaffle(fileWinnerWriter);


        store.putToy(new Toy(1, "Кукла", 5 ));
        store.putToy(new Toy(2, "Робот", 7 ));
        store.putToy(new Toy(3, "Машина", 10));
        store.putToy(new Toy(4, "Конструктор", 3));

        System.out.println("Toys in the store:");
        for (Toy toy : store.showAllToys()) {
            System.out.println(toy);
        }

        Toy prizeToy = store.runRaffle();
        if (prizeToy != null) {
            System.out.println("Prize Toy: " + prizeToy.getToyName());
            System.out.println("Updated toy list:");
            for (Toy toy : store.showAllToys()) {
                System.out.println(toy);
            }
        }
    }
}