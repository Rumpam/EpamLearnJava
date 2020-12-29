package String;

/* Для НЕ многопоточных программ. Работает быстрее чем StringBuffer
 * резервирует массив на 16 символов больше, чем требуется */
public class ExampleStringBuilder {
    final char[] nameArray = new char[]{'R', 'U', 'S', 'A', 'N'};
    final String name = new String(nameArray);
    final String lastName = "Mavlyashov";

    public void printName(final String name) {
        final StringBuilder sb = new StringBuilder(name);
        sb.append(" number ");
        sb.append("one");
    }
}
