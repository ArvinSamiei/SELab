package bridge;

public class ForPowerImpl extends PowerImpl {
    public ForPowerImpl(Mult mult) {
        super(mult);
    }

    @Override
    public int power(int first, int second) {
        int result = 1;
        for (int i = 0; i < second; i++) {
            result = mult.mult(result, first);
        }
        return result;
    }
}
