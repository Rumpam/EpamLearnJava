package trash;

public class PairTest {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        ArrayAlg.Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("first: " + mm.getFirst());
        System.out.println("second: " + mm.getSecond());
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<String>(min, max);
    }

    public static class Pair<T> {
        public Pair() {
            this.first = null;
            this.second = null;
        }

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        private T second;
        private T first;
    }
}