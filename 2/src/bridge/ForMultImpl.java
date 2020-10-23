package bridge;

public class ForMultImpl implements MultImpl {
    @Override
    public int mult(int first, int second) {
        int result = 0;
        for (int i = 0; i < second; i++) {
            result += first;
        }
        return result;
    }
}
