package Array;

import java.util.Arrays;

public class Array_reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Не оптимальный вариант " + Arrays.toString(reversArrayNotOptimate(array)));
        System.out.println("Оптимальный вариант " + Arrays.toString(returnArray(array)));
    }

    //не оптимальный вариант (лишний созданый массив)
    static int[] reversArrayNotOptimate(int[] arr) {
        int[] res = new int[arr.length]; //создание временного массива
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--, j++) {
            res[j] = arr[i];
        }
        return res;
    }

    static int[] returnArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}