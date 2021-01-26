package StructureData;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Group implements Iterable<Student> {
    private final Student[] students;

    public Group(final Student[] students) {
        this.students = students;
    }

    public Iterator<Student> iterator() {
        return new StudentsIterator(students);
    }

    private static class StudentsIterator implements Iterator<Student> {
        private int index = 0;
        private final Student[] students;

        private StudentsIterator(Student[] students) {
            this.students = students;
        }

        @Override
        public boolean hasNext() {
            return students.length > index;
        }

        @Override
        public Student next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return students[index++];
        }
    }
}
