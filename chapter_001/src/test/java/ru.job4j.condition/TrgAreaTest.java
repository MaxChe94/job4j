package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TrgAreaTest {

    @Test
    public void TrgArea() {
        double in[] = {2,2,2};
        double expected = 1.74;
        double out = TrgArea.area(in[0],in[1],in[2]);
        Assert.assertEquals(expected,out,0.01);
    }
}
