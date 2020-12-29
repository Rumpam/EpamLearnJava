package NestedAndInnerClass;

import java.util.ArrayList;
import java.util.List;

class Inner {
    private final String name;
    private final String address;
    private final List<Student> students;

    Inner(final String name, final String address) {
        this.name = name;
        this.address = address;
        students = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    List<Student> getStudentsList() {
        return students;
    }

    void showAllStudents() {
        System.out.println("Students list: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    static Inner.Student createStudent(final Inner inner, final String name, final int grade) {
        Inner.Student student = inner.new Student(name, grade);
        inner.students.add(student);
        return student;
    }

    public class Student {
        private final String name;
        private final int grade;

        public Student(final String name, final int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("name: %s, grade: %d", name, grade);
        }

        public String getName() {
            return this.name;
        }

        public int getGrade() {
            return grade;
        }

        public Inner getInner() {
            return Inner.this;
        }

    }
}
