package test;

import main.Rectangle;
import main.Shape;
import org.junit.Test;
import org.junit.Assert;

public class RectangleTest {

    @Test
    public void computeArea(){
        Shape rectangle = new Rectangle(10, 20);
        int computedArea = rectangle.computeArea();
        Assert.assertEquals(200, computedArea);
    }

    @Test
    public void changeWidth(){
        Shape rectangle = new Rectangle(10, 20);
        rectangle.setWidth(11);
        Assert.assertEquals(11, rectangle.getWidth());
    }

    @Test
    public void changeHeight(){
        Shape rectangle = new Rectangle(10, 20);
        rectangle.setHeight(11);
        Assert.assertEquals(11, rectangle.getHeight());
    }

}

