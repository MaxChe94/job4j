package ru.job4j.tracker;

public interface UserAction {
    String name();
    Boolean execute(Tracker tracker, Input input);
}
