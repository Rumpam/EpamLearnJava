package BaseConceptOop;

public abstract class AbstractCls {
    private int year;

    /* Выделение, важных характеристик и свойств объекта */
    public AbstractCls(int year) {
        this.year = year;
    }

    public abstract void call(int output);
    public abstract void ring(int input);
}
