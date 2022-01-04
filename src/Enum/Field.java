package Enum;

import java.util.ArrayList;

public class Field {
    enum FieldSize { SMALL, MIDDLE, LARGE };
    FieldSize size;

    public static void main(String[] args) {
        for (Figure f : Figure.values()) {
            System.out.println(f);
            System.out.println(Figure.X);
        }
        Figure f = Figure.valueOf("bla-bla");

        Field aField = new Field();
        aField.size = Field.FieldSize.SMALL;
        System.out.println("Выбрано поле, размером: " + aField.size);
    }
}
