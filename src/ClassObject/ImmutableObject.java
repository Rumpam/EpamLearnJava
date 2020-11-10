package ClassObject;

public class ImmutableObject {
    private final String name;
    private final String surName;

    public ImmutableObject(final String name, final String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        ImmutableObject io = new ImmutableObject("Test", "lastTame");
        String name = io.getName();
        System.out.println(name); //Test
    }
}
