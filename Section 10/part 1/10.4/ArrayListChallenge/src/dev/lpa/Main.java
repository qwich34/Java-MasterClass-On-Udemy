package dev.lpa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        printConsole();

    }

    private static void printConsole() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        ArrayList<String> list = new ArrayList<>();

        while(isValid) {
            System.out.println("""
                    Available actions:\s
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                    Enter a number for which action you want to do:\s""");
                int intInput = scanner.nextInt();



            switch (intInput) {
                case 0 -> isValid = false;
                case 1 -> addItem(list);
                case 2 -> removeItem(list);
                default -> System.out.println("Invalid Input, try again");
            }

            list.sort(Comparator.naturalOrder());
            System.out.println(list);
            }
        }

    private static void addItem(ArrayList<String> groceries) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add item(s) [separate items by comma]: ");
        String[] elements = scanner.nextLine().split(",");

        for (String i : elements) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItem(ArrayList<String> groceries) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remove item(s) [separate items by comma]: ");
        String[] elements = scanner.nextLine().split(",");

        for(String i : elements) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.remove(trimmed);
            }
        }
    }
}
