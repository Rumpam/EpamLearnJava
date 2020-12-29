package Anonymous;

public class Anonymous {
    static ISummator createSummator() {
        ISummator summator = new ISummator() {
            @Override
            public int plus(int a, int b) {
                return a + b;
            }

            @Override
            public int remDiv(int a, int b) {
                return a % b;
            }

            @Override
            public double div (int a, int b) {
                return (double) a / b;
            }
            @Override
            public int pow(int a, int b) {
                return (int) Math.pow(a, b);
            }
        };
        return summator;
    }
}
