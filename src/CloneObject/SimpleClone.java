package CloneObject;

import java.util.Arrays;

public class SimpleClone {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int[] clonedArr = arr.clone();
        arr[0] = 0;
        System.out.println(Arrays.toString(clonedArr));
    }
}
