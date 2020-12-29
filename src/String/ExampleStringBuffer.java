package String;

/* Для многопоточных программ */
public class ExampleStringBuffer {
    final String lastName = new String("Mavlyashov");

    public void lastName(final String lastName) {
        final StringBuffer stringBuffer = new StringBuffer(lastName);
        stringBuffer.append(" number ");
        stringBuffer.append("one");
    }

    public String task1(String in) {
        StringBuilder sb = new StringBuilder(in);
        sb.reverse();
        return sb.toString();
    }
}
