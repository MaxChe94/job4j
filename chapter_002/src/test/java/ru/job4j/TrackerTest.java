package ru.job4j;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;


public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem () {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        Assert.assertEquals(result.getName(), item.getName());
    }

    @Test
    public void findByNameTest () {
        Tracker tracker = new Tracker();
        String[] names = {"first", "second", "first", "third"};
        String[] n1 = {"first", "first"};
        for (String i :
                names) {
            tracker.add(new Item(i));
        }
        Item[] itms = tracker.findByName("first");
        String[] result = new String[itms.length];
        for (int j = 0; j < itms.length; j++) {
            if (itms[j].getName().equals("first")) {
                result[j] = itms[j].getName();
            }
        }
        Assert.assertEquals(result, n1);
    }

    @Test
    public void findAllTest () {
        Tracker tracker = new Tracker();
        String[] names = {"first", "second", "first", "third"};
        for (String i :
                names) {
            tracker.add(new Item(i));
        }
        Item[] itms = tracker.findAll();
        String[] result = new String[itms.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = itms[i].getName();
        }
        Assert.assertEquals(result, names);
    }

}