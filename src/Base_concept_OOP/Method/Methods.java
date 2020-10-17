package Base_concept_OOP.Method;

import java.util.Arrays;

public class Methods {
    //Метод с переменным количеством аргументов
    public void method(int... values) {
        System.out.println(Arrays.toString(values));
    }

    //перегруженный метод
    public void method(int a, int b) {
        System.out.println(a + " " + b);
    }

    //переопределенный метод (добавился тип/изменился модификатор доступа)
    protected String method(String str){
        return "hi";
    }
    public static void main(String[] args) {
        Methods param = new Methods();
        int[] arr = {1, 2}; //передать можно массив целиком
        param.method(arr);
        param.method(2, 3); //или через запятую
        param.method(); //пустой аргумент тоже может быть
        param.method("wow"); //использование переопределенного метода

        param.method(4, 5); //компилятор выберет перегруженный метод
    }
}
