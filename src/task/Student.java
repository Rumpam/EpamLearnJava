package task;

public class Student {
    //Геттеры и Сетторы для поля static не создают
    static String faculty; //удобно для использования всех студентов одного факультета
    private long studentId;
    private int yearOfStudy;
    private String name = "";

    public void Student(long studentId){
        this.studentId = studentId;
    }
}
