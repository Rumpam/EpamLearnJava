package Generic;

public class Triple<T1, T2, T3> extends Tuple1<T1, T2> {
    private final T1 left;
    private final T2 right;
    private final T3 middle;

    public Triple(final T1 left, T2 right, T3 middle) {
        super(left, right);
        this.left = left;
        this.right = right;
        this.middle = middle;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }

    public T3 getMiddle() {
        return middle;
    }
}
