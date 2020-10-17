package Operators;

public class Switch {
    static void valToSwitch(int value) {
        /* в условие можно использовать только значения типов: byte/short/char/int
        в отличии от if-then/if-then-else где условия могут быть с любыми типами */
        switch (value) { // switch (<условие>) { case 0: <оператор1> }
            case 0: {
                System.out.println("mode 0");
                break;
            }
            case 1:
            case 2: {
                System.out.println("mode 0 or 1 or 2");
                break;
            }
            default:
                System.out.println("default value");
                break;
        }
    }

    public static void main(String[] args) {
        valToSwitch(2);
    }
}
