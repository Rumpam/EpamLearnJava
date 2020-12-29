package Abstract;

public abstract class AbstractExample {
    public void process() {
        final String text = readString();
        final String result = text.replace(":)", "=)");
        System.out.println(result);
    }

    protected abstract String readString();
}
