package dev.lpa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        printConsole();
    }

    private static void printConsole() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        while(isValid) {
            System.out.print(""" 
                Available actions(Select word or letter:\s
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                Enter a number for which action you want to do:\s""");
            String menuInput = scanner.nextLine().toUpperCase();
            System.out.println(menuInput);

            LinkedList<Place> list = townList();

            switch(menuInput.charAt(0)) {
                case 'F' -> forwardAction(list);
                case 'B' -> backwardAction(list);
                default -> isValid = false;
            }
        }
    }
    private static LinkedList<Place> townList() {
        LinkedList<Place> list = new LinkedList<>();

        Place sidney = new Place("Sidney", 0);
        Place adelaide = new Place("Adelaide", 1374);
        Place aliceSprings = new Place("Alice Springs", 2771);
        Place brisbane = new Place("Brisbane", 917);
        Place darwin = new Place("Darwin", 3972);
        Place melbourne = new Place("Melbourne", 877);
        Place pereth = new Place("Pereth", 3923);

        list.add(sidney);
        list.add(adelaide);
        list.add(aliceSprings);
        list.add(brisbane);
        list.add(darwin);
        list.add(melbourne);
        list.add(pereth);
        list.add(melbourne);
        list.add(adelaide);

        list.sort(new MinDistanceComparator());
        // Remove duplicates
        LinkedList<Place> uniqueList = new LinkedList<>();
        for (Place place : list) {
            if (!uniqueList.contains(place)) {
                uniqueList.add(place);
            } else {
                System.out.println("Found duplicate: " + place);
            }
        }
        return list = uniqueList;
    }
    private static void forwardAction (LinkedList<Place> list) {

        Place previousTown = list.getFirst();
        System.out.println("Trip starts at " + list.getFirst());
        ListIterator<Place> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown
                    + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void backwardAction (LinkedList<Place> list) {

        Place previousTown = list.getFirst();
        System.out.println("Trip starts at " + list.getLast());
        ListIterator<Place> iterator = list.listIterator(0);

        while(iterator.hasNext()) {
            iterator.next();
        }

        while(iterator.hasPrevious()) {
            var town = iterator.previous();
            System.out.println("--> From: " + previousTown
                    + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getFirst());
    }

}
