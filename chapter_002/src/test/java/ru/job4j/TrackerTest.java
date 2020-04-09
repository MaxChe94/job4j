package ru.job4j;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;


public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        Assert.assertEquals(result.getName(), item.getName());
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        Item[] n = new Item[4];
        n[0] = tracker.add(new Item("first"));
        n[1] = tracker.add(new Item("second"));
        n[2] = tracker.add(new Item("first"));
        n[3] = tracker.add(new Item("third"));
        Item[] n1 = {n[0], n[2]};
        Item[] result = tracker.findByName("first");
        Assert.assertEquals(n1, result);
    }

    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        Item[] n = new Item[4];
        n[0] = tracker.add(new Item("first"));
        n[1] = tracker.add(new Item("second"));
        n[2] = tracker.add(new Item("third"));
        n[3] = tracker.add(new Item("four"));
        Item[] result = tracker.findAll();
        Assert.assertEquals(n, result);
    }

    @Test
    public void findByIdTest() {
        Tracker tracker = new Tracker();
        Item[] n = new Item[4];
        n[0] = tracker.add(new Item("first"));
        n[1] = tracker.add(new Item("second"));
        n[2] = tracker.add(new Item("third"));
        n[3] = tracker.add(new Item("four"));
        Item result = tracker.findById(n[2].getId());
        Assert.assertEquals(n[2], result);
    }

}