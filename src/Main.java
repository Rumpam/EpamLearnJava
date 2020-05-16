import Array.Array;

public class Main {

    public static void main(String[] args) {
        String hello = "Hello";
        String world = "world";
        System.out.println(hello + " " + world + "!");
        Array.createArrayMethod();

        //&& и ||
        boolean a = true && false; //false
        boolean a1 = false && true; //false
        System.out.println(a);
        System.out.println(a1);

        boolean b = true || false; //true
        boolean b1 = false || true; //true
        System.out.println(b);
        System.out.println(b1);
    }
}
