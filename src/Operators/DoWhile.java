package Operators;

public class DoWhile {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 1) {
            num++;
        }
        /* отличие от while(){ } - тут блок выполнится хотябы 1 раз, если даже условие false */
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}
