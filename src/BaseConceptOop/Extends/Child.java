package BaseConceptOop.Extends;

public class Child extends Parent {
    String sex;

    public Child(Child ch) {
        super();
        this.sex = ch.sex;
    }
}
