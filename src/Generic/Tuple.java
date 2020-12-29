package Generic;

public class Tuple<T> {
    private final T left;
    private final T right;

    public Tuple(final T left, final T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    public static void main(String[] args) {
        final Tuple<String> tStr = new Tuple<>("hello", "world"); //правую часть можно писать без указания типа
        System.out.println(tStr.getLeft());

        final Tuple<Integer> tInt = new Tuple<>(1, 2);
        System.out.println(tInt.getRight());

        final Tuple<SuperClass> tuple = new Tuple<>(new SuperClass(), new SuperClass());
        System.out.println(tuple.getLeft());
    }

    private static class SuperClass {
        @Override
        public String toString() {
            return "super";
        }
    }
}
