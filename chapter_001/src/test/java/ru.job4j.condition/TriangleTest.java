package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point a = new Point(0,0);
        Point b = new Point(2,5);
        Point c = new Point(4,0);
        Triangle t = new Triangle(a,b,c);
        boolean result = (t.area() != -1);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(0,0);
        Point b = new Point(0,0);
        Point c = new Point(4,0);
        Triangle t = new Triangle(a,b,c);
        boolean result = (t.area() != -1);
        assertThat(result, is(false));
    }
}
