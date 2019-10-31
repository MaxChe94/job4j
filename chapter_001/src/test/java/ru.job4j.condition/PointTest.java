package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int in[] = {0,0,2,0};
        double expected = 2.0;
        double out = Point.distance(in[0],in[1],in[2],in[3]);
        Assert.assertEquals(expected,out,0.01);

    }
}
