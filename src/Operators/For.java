package Operators;

public class For {
    public static void main(String[] args) {
        int[] someArr = {1, 2, 3};
        //use foreach
        for (int value : someArr) { //<имя_переменной> : <то_по_чему_будет_итерироваться> { <оператор> }
            System.out.print(value + ", ");
        }
        System.out.println("\n");

        incElemArray(someArr, 1);
        for (int i = 0; i < someArr.length; i++) { //<инициализация>; <условие>; <инкремент> { <оператор> }
            System.out.print(someArr[i] + ", ");
        }

        //use label
        outer_for:
        for (int n = 0; n < 5; n++) {
            inner_for:
            for(int m = 0; m < 5; m++) {
                if ((n == 2) && (m == 3)) {
                    break outer_for;
                }
                System.out.println("n = " + n + "; m =" + m);
            }
        }
    }

    //метод для увеличения элементов массива
    static void incElemArray(int[] array, int value) {
        for (int elem : array) {
            elem += value;
        }
    }
}
