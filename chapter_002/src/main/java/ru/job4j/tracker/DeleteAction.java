package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return ("=== Delete Item ====");
    }

    @Override
    public Boolean execute(Tracker tracker, Input input) {
        String id = input.askStr("Print ID Item to Delete");
        if (tracker.delete(id)) {
            System.out.println("Successfully!");
        } else {
            System.out.println("Error!");
        }
        return true;
    }
}

