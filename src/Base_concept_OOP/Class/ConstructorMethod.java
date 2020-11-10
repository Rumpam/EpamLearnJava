package Base_concept_OOP.Class;

public class ConstructorMethod {
    public static void main(String[] args) {
        /* 1способ создания конструктора при помощи NEW
        - т.к у класса есть конструктор по-умолчанию
        - используется если в классе явно не определен конструктор */
        Subject subject = new Subject();
        subject.setNumber(1);

    }
}
