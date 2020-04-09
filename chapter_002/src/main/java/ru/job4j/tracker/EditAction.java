package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return ("=== Edit Item ====");
    }

    @Override
    public Boolean execute(Tracker tracker, Input input) {
        String id = input.askStr("Print ID Item to Edit");
        Item newItem = new Item(input.askStr("Print a new Name"));
        if (tracker.replace(id, newItem)) {
            System.out.println("Successfully!");
        } else {
            System.out.println("Error!");
        }
        return true;
    }
}
