package bridge;

public abstract class PowerImpl {

    protected Mult mult;

    public PowerImpl(Mult mult) {
        this.mult = mult;
    }

    public abstract int power(int a, int b);

}
