package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {

    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item1 = new Item("find it");
        Item item2 = new Item("find it");
        Item item3 = new Item("And it");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        FindByNameAction act = new FindByNameAction();
        act.execute(tracker, new StubInput(new String[] {"find it"}));
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item1.getName() + ", ID = " + item1.getId())
                .add(item2.getName() + ", ID = " + item2.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}