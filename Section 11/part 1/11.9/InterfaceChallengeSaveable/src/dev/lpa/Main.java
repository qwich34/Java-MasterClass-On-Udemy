package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ISaveable> players = new ArrayList<>();
        players.add(new Player("Tim", 5, 1));
        players.add(new Player("Man", 10, 15));
        players.add(new Player("Tom", 20, 25));
        players.add(new Player("Timofey", 10, 25));

        printList(players);
    }

    private static void printList(List<ISaveable> players) {
        for(ISaveable player : players) {
            player.write();
            System.out.println(player);
            System.out.println(player.write() + "wrote this player into the system");
        }
    }
}
