package Generic;

public class TupleNotTypedExtends extends TupleVariousType<String, String> {
//при наследвоании, не типизированный класс от типизированого - нужно явно указывать все типы
    private final String middle;

    public TupleNotTypedExtends(final String left, final String right, final String middle) {
        super(left, right);
        this.middle = middle;
    }

    public String getMiddle() {
        return middle;
    }

    public static void main(String[] args) {
        TupleNotTypedExtends t = new TupleNotTypedExtends("left", "right", "middle");
        System.out.println(t.getMiddle());
    }
}
