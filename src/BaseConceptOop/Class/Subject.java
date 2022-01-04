package BaseConceptOop.Class;

//информационный класс(класс объекта)
public class Subject {
    private int number;

    /* конструктор по-умолчанию
    - у любого класса есть конструктор по-умолчанию
    - если класс не public, то конструктор будет всегда публичным
    - перед конструктом не могут быть ключевые поля (abstract/final/static), только public/private/protected

    Преназначение конструктора - инициализация полей класса
    */
    public Subject() {
        super();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getStudent() {
        return number;
    }

    public int[] create_obj_id(int[] number) {
        int[] id = new int[]{};
        return id;
    }
}
