package bridge;

public class Power {

    private PowerImpl imp;

    public Power(PowerImpl imp) {
        this.imp = imp;
    }

    public int power(int first, int second) {
        return imp.power(first, second);
    }
}
