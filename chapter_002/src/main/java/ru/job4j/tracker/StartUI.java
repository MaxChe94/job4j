package ru.job4j.tracker;

public class StartUI {
    public static void createItem (Tracker tracker, Input input) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void printItems (Tracker tracker, Input input) {
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
    }

    public static void editItem (Tracker tracker, Input input) {
        System.out.println("=== Edit Item ====");
        String id = input.askStr("Print ID Item to Edit");
        Item newItem = new Item(input.askStr("Print a new Name"));
        if (tracker.replace(id, newItem)) {
            System.out.println("Successfully!");
        } else {
            System.out.println("Error!");
        }
    }

    public static void deleteItem (Tracker tracker, Input input) {
        System.out.println("=== Delete Item ====");
        String id = input.askStr("Print ID Item to Delete");
        if (tracker.delete(id)) {
            System.out.println("Successfully!");
        } else {
            System.out.println("Error!");
        }
    }

    public static void findItemsByName (Tracker tracker, Input input) {
        System.out.println("=== Find items by name ====");
        int i = 0;
        Item[] items = tracker.findByName(input.askStr("Print name"));
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
    }

    public static void findItemById (Tracker tracker, Input input) {
        System.out.println("=== Find Item by Id ====");
        String id = input.askStr("Print ID Item");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item not found");
        } else {
            System.out.println('"' + item.getName() + ", ID = " + item.getId() + '"');
        }
    }

    public void init (Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                createItem(tracker, input);
            } else if (select == 1) {
                printItems(tracker, input);
            } else if (select == 2) {
                editItem(tracker, input);
            } else if (select == 3) {
                deleteItem(tracker, input);
            } else if (select == 4) {
                findItemById(tracker, input);
            } else if (select == 5) {
                findItemsByName(tracker, input);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}