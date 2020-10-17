package Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(Arrays.toString(getEvenDigits(arr)));
    }

    public static int[] getEvenDigits(int[] values) {
        int[] newArr = new int[]{};
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                newArr = new int[]{values[i]}; //как-то нужно записать все знач. в новый массив
            }
        }
        return newArr;
    }

    public static int[] createArrayMethod() {
        int[] arr = new int[10]; //объявление массива размерностью - 10
        for (int i = 0; i < arr.length; i++) { //заполняю массив значениями, при помощи цикла
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
        return arr;
    }
}