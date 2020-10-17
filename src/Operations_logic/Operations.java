package Operations_logic;

public class Operations {
    public static void main(String[] args) {
        /* Логические операции */
        boolean a = true && false;  //если левый операнд = true - то вычисляется и правый операнд
        boolean a1 = false && true; //если левый = false - то правый НЕ вычисляется
        System.out.println(a); //false
        System.out.println(a1); //false

        //правила для || противополжные
        boolean b = true || false;  //если левый = true - то правый НЕ вычисляется
        boolean b1 = false || true; //если левый = false - то вычисляется и правый
        System.out.println(b); //true
        System.out.println(b1); //true

        /* Тернарный оператор ?:
         *  <выражение_boolean> ? <выражение1> : <выражение2> */
        int x = 3 > 2 ? 5 : 3;
        String str = 3 == 2 ? "YES" : "NO";
        System.out.println(x);
        System.out.println(str);
    }
}

