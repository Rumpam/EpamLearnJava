package Generic;

public class TupleTypedExtends<T> extends TupleVariousType<T, T> {
    private final T middle;

    public TupleTypedExtends(final T left, final T right, final T middle) {
        super(left, right);
        this.middle = middle;
    }

    public T getMiddle() {
        return middle;
    }

    public static void main(String[] args) {
        TupleTypedExtends<Long> t;
    }
}
