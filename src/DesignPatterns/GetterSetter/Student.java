package DesignPatterns.GetterSetter;

public class Student {
    private String name;
    private int grade;

    public Student(final String name, final int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
