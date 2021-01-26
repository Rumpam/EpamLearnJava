package StructureData;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayCollection<T> implements Collection<T> {

    private T[] array = (T[]) new Object[1];

    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(final Object o) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ElementsIterator();
    }

    private class ElementsIterator implements Iterator<T> {
        private int size;

        @Override
        public boolean hasNext() {
            return ArrayCollection.this.size() > size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return ArrayCollection.this.array[size++];
        }
    }

    @Override
    public Object[] toArray() {
        final T[] newArray = (T[]) new Object[this.size()];
        System.arraycopy(array, 0, newArray, 0, this.size);
        return newArray;
    }

    @Override
    /*This method may prove to be too difficult.
    he test is not covered.*/
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) toArray();
    }

    @Override
    public boolean add(final T t) {
        if (array.length == size) { //если длинна созданного ранее массива, стала равной размеру(
            final T[] oldArray = array; //сох.старый массив
            array = (T[]) new Object[size() * 2]; //созд. нов.массив
            System.arraycopy(oldArray, 0, array, 0, oldArray.length);//скопировать данные из старого массива в новый
        }
        array[size++] = t; //записали в ячейку массива array[size++] элемент t(переданный параметром)
        return true;
    }

    @Override
    public boolean remove(final Object o) {
        for (int i = 0; i < size; i++) { //бежим по всем объектам до size
            if (array[i].equals(o)) { //если объект массива на ячейке i равен объекту который передан в параметре
                if (i != this.size() - 1 && i != size() - 1) { //и если итерация i не равна size() - 1
                    System.arraycopy(array, i + 1, array, i, this.size() - i - 1);
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        for (final Object item : c) { //проитерироваться по всем элементам той коллекции
            if (!this.contains(item)) { //если эта коллекция не содержий элемента из той коллекции
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(final Collection<? extends T> c) {
        for (final T item : c) {
            add(item);
        }
        return true;
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        for (final Object item : c) {
            remove(item);
        }
        return true;
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        for (int i = 0; i < size(); i++) {                //проитерируйся по текущей коллекции
            if (!c.contains(array[i])) {                    //и для каждого элемента текущей коллекции если он не содержится в той коллекции
                this.remove(array[i]);                      //мы и у себя его удаляем
                i--;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        array = (T[]) new Object[1];
        size = 0;
    }
}
