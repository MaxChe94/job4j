package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return ("=== Create a new Item ====");
    }

    @Override
    public Boolean execute(Tracker tracker, Input input) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
