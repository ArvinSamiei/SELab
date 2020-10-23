package test;

import main.ISquare;
import main.Square;
import main.Shape;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void computeArea(){
        Shape square = new Square(10);
        int computedArea = square.computeArea();
        Assert.assertEquals(100, computedArea);
    }

    @Test
    public void setSideLengthToAPositiveNumber(){
        ISquare square = new Square(10);
        square.setSideLength(11);
        Assert.assertEquals(11, square.getSideLength());
    }

    @Test
    public void setSideLengthToANegativeNumber(){
        ISquare square = new Square(10);
        square.setSideLength(-11);
        Assert.assertEquals(10, square.getSideLength());
    }

}
