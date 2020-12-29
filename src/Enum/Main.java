package Enum;

public class Main {
    public static void main(String[] args) {
        for (Figure f : Figure.values()) {
            System.out.println(f);
            System.out.println(Figure.X);
        }
        Figure f = Figure.valueOf("blabla");
    }
}
