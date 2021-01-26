package StructureData;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class University implements Iterable<Student> {
    private final Student[] students;

    public University(final Student[] students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator<Student> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return University.this.students.length > index; //указатель на объект типа University который использовался для создания этого итератора
        }

        @Override
        public Student next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            return University.this.students[index++];
        }
    }
}