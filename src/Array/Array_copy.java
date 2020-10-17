package Array;

import java.util.Arrays;

public class Array_copy {
    public static void main(String[] args) {
        //копирование массива
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6, 0, 0, 0};
        System.arraycopy(a, 0, b, 3, a.length); //<из_массива_A> начиная с индекса 0, в <массив_Б>, длинну <массива_А>
        System.out.println(Arrays.toString(b));

        //клонирование массива
        int[] c = b.clone();
        System.out.println("Клонированный массив " + Arrays.toString(c));
    }
}
