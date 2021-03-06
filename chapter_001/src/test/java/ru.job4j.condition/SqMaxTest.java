package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 5, 2, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 3, 6, 1);
        assertThat(result, is(6));
    }

    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 3, 2, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenEquals() {
        SqMax check = new SqMax();
        int result = check.max(4, 4, 4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void j4jTest() {               // добавил тест
        SqMax check = new SqMax();
        int result = check.max(4, 1, 8, 1);
        assertThat(result, is(8));
    }

}

