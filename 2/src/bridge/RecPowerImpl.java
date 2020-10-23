package bridge;

public class RecPowerImpl extends PowerImpl {

    public RecPowerImpl(Mult mult) {
        super(mult);
    }

    @Override
    public int power(int first, int second) {
        if (second == 0)
            return 1;
        if (second % 2 == 1){
            return mult.mult(mult.mult(first, power(first, second / 2)), power(first, second / 2));
        }
        else
            return mult.mult(power(first, second / 2), power(first, second / 2));
    }
}
