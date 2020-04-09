package ru.job4j.tracker;

public class FindByIDAction implements UserAction {
    @Override
    public String name() {
        return ("=== Find Item by Id ====");
    }

    @Override
    public Boolean execute(Tracker tracker, Input input) {
        String id = input.askStr("Print ID Item");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item not found");
        } else {
            System.out.println('"' + item.getName() + ", ID = " + item.getId() + '"');
        }
        return true;
    }
}
