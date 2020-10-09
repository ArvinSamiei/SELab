package test;

import org.junit.Test;
import org.junit.Assert;

public class ReactangleTest {

    @Test
    public void computeArea(){
        Rectangle rectangle = new Rectangle(10, 20);
        int computedArea = rectangle.computeArea();
        Assert.assertEquals(200, computedArea);
    }

}
