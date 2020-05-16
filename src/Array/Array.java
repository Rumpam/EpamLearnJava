package Array;

public class Array {
    public static void main(String[] args) {
        //созд. и инициализация массива значениями
        String[] array = {"one", "two"}; //быстрый способ #1
        System.out.println(array[1]);

        int[] array1 = new int[1]; //длинный способ #2 (с размерностью)
        array1[0] = 1;
        System.out.println(array1[0]);

        int[] array2; //длинный способ #3 (пустой массив без размерности
        array2 = new int[]{}; //заполниться знач. по-умолчанию для типа - массив (null)

        //единственный способ изменить размерность массива - переопределить ссылку на массив
        int[] chaArr = new int[1];
        chaArr = new int[2];
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