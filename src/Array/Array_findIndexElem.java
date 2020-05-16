package Array;

public class Array_findIndexElem {
    public static void main(String[] args) {
        int[] c = {12, 4, 5};
        find(c, 4);

        char[] arr = {'a', 'b', 'c'};
        System.out.println("index elem - " + binarySearch(arr, 'e'));
    }

    //найти индекс определенного элемента массива
    public static int find(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println("index is - " + i);
                return i;
            }
        }
        return -1;
    }

    /* бинарный поиск(нужен отсортированный массив) */
    static int binarySearch(char[] arr, char key) {
        int left = 0;
        int right = arr.length;
        while (true) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) { //выбор в какой половине массива может быть значение
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
    }
}
