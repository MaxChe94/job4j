package ru.job4j.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return ("");
    }

    @Override
    public Boolean execute(Tracker tracker, Input input) {
        return false;
    }
}
