package ru.job4j;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        String[] names = {"first", "second", "first", "third"};
        String[] n1= {"first", "first"};
        for (String i:
             names) {
            tracker.add(new Item(i));
        }
        Item[] itms = tracker.findByName("first");
        String[] result = new String[itms.length];
        for (int j = 0; j < itms.length; j++){
            if (itms[j].getName().equals("first")) {
                result[j] = itms[j].getName();
            }
        }
        assertEquals(result, n1);
    }
}