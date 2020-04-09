package ru.job4j.tracker;

public class PrintAction implements UserAction {
    @Override
    public String name() {
        return ("=== Current Items ====");
    }

    @Override
    public Boolean execute(Tracker tracker, Input input) {
        int i = 0;
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : tracker.findAll()) {
                System.out.println(i + 1 + ". " + item.getName() + ", ID = " + item.getId());
                i++;
            }
        } else {
            System.out.println("Items not found!");
        }
        return true;
    }
}
