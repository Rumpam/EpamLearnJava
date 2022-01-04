package BaseConceptOop.Extends;

public class Parent {
    String name;
    String lastName;
    int age;

    public Parent(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Parent() {
    }

    public String getName() {
        return name;
    }
}
