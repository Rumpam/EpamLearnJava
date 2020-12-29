package NestedAndInnerClass;

public class SomeMainClass {
    public static void main(String[] args) {
        External.messenger("доступ к статическому методу внешнего класса");
        String res = External.Nested.getInstanceCounter(); //доступ к статическоу методу вложенного класса

        External external = new External(0, 0); //создание экземпляра, статического внешнего класса
        external.sum();                               //обращение к нестатическому методу с уровнем доступа - default


        External.Nested nestedInstance = new External.Nested();
        nestedInstance.methodOfExperiments(); //доступ к не статическому члену статического класса
    }
}
