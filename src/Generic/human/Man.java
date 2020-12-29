package Generic.human;

public class Man implements Human {
    final String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Sex getSex() {
        return Sex.M;
    }
}
