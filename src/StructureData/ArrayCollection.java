package StructureData;

import java.util.Arrays;
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
    public Object[] toArray() {
        final T[] newArray = (T[]) new Object[this.size()];
        System.arraycopy(array, 0, newArray, 0, this.size);
        return newArray;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (this.size() <= a.length) {
            System.arraycopy(this.array, 0, a, 0, this.size());
            return a;
        }
        return (T1[]) Arrays.copyOf(this.array, this.size(), a.getClass());
    }

    @Override
    public boolean add(final T t) {
        if (array.length == size) {                //если длинна созданного ранее массива, стала равной размеру(
            final T[] oldArray = array;            //сох.старый массив
            array = (T[]) new Object[size() * 2];  //созд. нов.массив
            System.arraycopy(oldArray, 0, array, 0, oldArray.length);//скопировать данные из старого массива в новый
        }
        array[size++] = t; //записали в ячейку массива array[size++] элемент t(переданный параметром)
        return true;
    }

    @Override
    public boolean remove(final Object o) {
        for (int i = 0; i < size; i++) { //бежим по всем объектам до size
            if (array[i].equals(o)) {    //если объект массива на ячейке i равен объекту который передан в параметре
                this.remove(i);
                return true;
            }
        }
        return false;
    }

    private void remove(final int index) {
        if (index != this.size() - 1)
            System.arraycopy(array, index + 1, array, index, this.size() - index - 1);
        if (this.size() != 0) {
            size--;
        }
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

    @Override
    public Iterator<T> iterator() {
        return new ElementsIterator();
    }

    private class ElementsIterator implements Iterator<T> {
        private int index;
        private int last = -1;

        @Override
        public boolean hasNext() {
            return ArrayCollection.this.size() > index;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            last = index;
            return ArrayCollection.this.array[index++];
        }

        @Override
        public void remove() throws IllegalStateException {
            if (last == -1) {
                throw new IllegalStateException();
            }
            ArrayCollection.this.remove(last);
            index--;
            last = -1;
        }
    }
}
