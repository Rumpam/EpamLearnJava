package Generic;

public class TupleVariousType<T1, T2> {
    private final T1 left;
    private final T2 right;

    public TupleVariousType(final T1 left, final T2 right) {
        this.left = left;
        this.right =  right;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }

    public static void main(String[] args) {
        final TupleVariousType<Long, String> anyT = new TupleVariousType<Long, String>(1L, "First");
        System.out.println(anyT.getLeft() + " " + anyT.getRight());
    }
}
