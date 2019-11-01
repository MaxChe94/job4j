package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrinagleTest {
    @Test
    public void whenExist() {
        boolean result = Trinagle.exist(2, 2, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean result = Trinagle.exist(15, 2, 2);
        assertThat(result, is(false));
    }
}
