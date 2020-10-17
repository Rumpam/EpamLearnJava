package Array;

import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {
        int[] a = {3, 4, 234, 1};
        int temp;
        /* пузырьковая сортировка (по возрастанию)
        - внешний цикл
            - начинается с индекса на 1 меньше
            - условие, больше или равно 1
            - декремент. Цикл пойдет с конца массива
        - внутренний цикл
            - индекс с нуля
            - условие, внутренний цикл меньше внешнего
            - инкремент. Цикл пойдет от начала массива
        - условие
            - проверяет разность 2ух соседних элементов
            - во временную переменную запишется самое большое, из соседних элементов
            - перезапись соседних элементов
                - по индексу, где самое большое число, запишется соседний
                - а в соседний, запишется самый большой(скопированный во времен.переменную) */
        for (int out = a.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        //поиск наименьшего элемента и сортировка по возрастанию
        int[] b = {100, 3, 56, 7};
        for (int i = 0; i < b.length; i++) {
            int minValue = b[i]; //возьмем за минимальное, знач. в первом индексе
            int minIndex = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] < minValue) {
                    minValue = b[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = b[i];
                b[i] = b[minIndex];
                b[minIndex] = tmp;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
