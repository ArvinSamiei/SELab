package bridge;

public class Mult {

    private MultImpl impl;

    public Mult(MultImpl impl) {
        this.impl = impl;
    }

    public int mult(int first, int second){
        return impl.mult(first, second);
    }

}
