package main;

public class Square implements ISquare {

    int sideLength;

    public Square(int sideLength) {
        setSideLength(sideLength);
    }

    @Override
    public int computeArea() {
        return sideLength * sideLength;
    }

    @Override
    public void setSideLength(int sideLength) {
        if (sideLength < 0)
            return;
        this.sideLength = sideLength;
    }

    @Override
    public int getSideLength() {
        return this.sideLength;
    }
}
