package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return ("=== Find items by name ====");
    }

    @Override
    public Boolean execute(Tracker tracker, Input input) {
        int i = 0;
        Item[] items = tracker.findByName(input.askStr("Print name"));
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item.getName() + ", ID = " + item.getId());
                i++;
            }
        } else {
            System.out.println("Items not found!");
        }
        return true;
    }
}
