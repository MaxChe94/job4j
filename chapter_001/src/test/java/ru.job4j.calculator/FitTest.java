package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 185;
        double expected = 97.74;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 163;
        double expected = 60.95;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}
