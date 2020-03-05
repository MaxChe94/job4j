package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init (Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("=== Current Items ====");
                int i = 0;
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item :
                            tracker.findAll()) {
                        System.out.println(i + 1 + ". " + item.getName() +
                                ", ID = " + item.getId());
                        i++;
                    }
                } else {
                    System.out.println("Items not found!");
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                System.out.println("Print ID Item to Edit");
                String id = scanner.nextLine();
                if (tracker.findById(id) == null) {
                    System.out.println("Error! Item not found!");
                } else {
                    System.out.println("Print a new Name");
                    Item newItem = new Item(scanner.nextLine());
                    newItem = tracker.replace(id, newItem);
                    if (newItem != null) {
                        System.out.println("Successfully! New Item is " + '"' +
                                newItem.getName() + ", ID = " + newItem.getId() + '"');
                    } else {
                        System.out.println("Error!");
                    }
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.println("Print ID Item to Delete");
                String id = scanner.nextLine();
                Item item = tracker.delete(id);
                if (item != null) {
                    System.out.println("Successfully! Item " + '"' + item.getName() +
                            ", ID = " + item.getId() + '"' + " was Delete!");
                } else {
                    System.out.println("Error!");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ====");
                System.out.println("Print ID Item");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item not found");
                } else {
                    System.out.println('"' + item.getName() + ", ID = " + item.getId() + '"');
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                int i = 0;
                System.out.println("Print name");
                Item[] items = tracker.findByName(scanner.nextLine());
                if (items.length > 0) {
                    for (Item item :
                            items) {
                        System.out.println(i + 1 + ". " + item.getName() +
                                ", ID = " + item.getId());
                        i++;
                    }
                } else {
                    System.out.println("Items not found!");
                }


            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu () {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}