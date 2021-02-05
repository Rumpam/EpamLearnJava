package StructureData;

import java.util.*;

public class LinkedList<T> implements List<T> {

    private Item<T> firstInList = null;

    private Item<T> lastInList = null;

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
        // BEGIN (write your solution here)
        if (firstInList == null) return false;
        for (T item : this) {
            if ((o == null)? item == null: o.equals(item)) return true;
        }
        return false;
        // END
    }

    @Override
    public Iterator<T> iterator() {
        return new ElementsIterator(0);
    }

    @Override
    public Object[] toArray() {
        // BEGIN (write your solution here)
        Object[] result = new Object[size];
        int i = 0;
        for (Item<T> x = firstInList; x != null; x = x.nextItem) {
            result[i++] = x.element;
        }
        return result;
        // END
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        // BEGIN (write your solution here)
        if (a.length < size) {
            return (T1[]) Arrays.copyOf(a, size, a.getClass());
        }
        int i = 0;
        T1[] result = a;
        for (Item<T> x = firstInList; x != null; x = x.nextItem) {
            result[i++] = (T1) x.element;
        }
        if (a.length < size) {
            a[size] = null;
        }
        return a;
        // END
    }

    @Override
    public boolean add(final T newElement) {
        // BEGIN (write your solution here)
        return true;
        // END
    }

    @Override
    public void add(final int index, final T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(final Object o) {
        // BEGIN (write your solution here)
        return true;
        // END
    }

    @Override
    public T remove(final int index) throws IndexOutOfBoundsException {
        // BEGIN (write your solution here)
        return null;
        // END
    }

    private void remove(final Item<T> current) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        for (final Object item : c) {
            if (!this.contains(item)) {
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
    public boolean addAll(final int index, final Collection elements) {
        throw new UnsupportedOperationException();
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
        this.removeIf(item -> !c.contains(item));
        return true;
    }

    @Override
    public void clear() {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public List<T> subList(final int start, final int end) {
        return null;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new ElementsIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(final int index) {
        return new ElementsIterator(index);
    }

    @Override
    public int lastIndexOf(final Object target) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(final Object o) {
        // BEGIN (write your solution here)
        int index = 0;
        if (o == null) {
            for (Item<T> x = firstInList; x != null; x = x.nextItem) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Item<T> x = firstInList; x != null; x = x.nextItem) {
                if (o.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
        // END
    }

    @Override
    public T set(final int index, final T element) {
        // BEGIN (write your solution here)
        return null;
        // END
    }

    @Override
    public T get(final int index) {
        // BEGIN (write your solution here)
        return null;
        // END
    }

    private Item<T> getItemByIndex(final int index) {
        // BEGIN (write your solution here) An auxiliary method for searching for node by index.
        return null;
        // END
    }

    private class ElementsIterator implements ListIterator<T> {

        private Item<T> currentItemInIterator;

        private Item<T> lastReturnedItemFromIterator;

        private int index;

        ElementsIterator(final int index) {
            // BEGIN (write your solution here)
            this.index = index;
            // END
        }

        @Override
        public boolean hasNext() {
            // BEGIN (write your solution here)
            return LinkedList.this.size() > index;
            // END
        }

        @Override
        public T next() {
            // BEGIN (write your solution here)
            return null;
            // END
        }

        @Override
        public boolean hasPrevious() {
            // BEGIN (write your solution here)
            return previousIndex() >= 0;
            // END
        }

        @Override
        public T previous() {
            // BEGIN (write your solution here)
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (currentItemInIterator == null) {
                currentItemInIterator = lastReturnedItemFromIterator;
            } else {
                lastReturnedItemFromIterator = currentItemInIterator.prevItem;
                currentItemInIterator = currentItemInIterator.prevItem;
            }
            return currentItemInIterator.element;
            // END
        }

        @Override
        public void add(final T element) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(final T element) {
            // BEGIN (write your solution here)

            // END
        }

        @Override
        public int previousIndex() {
            // BEGIN (write your solution here)
            return nextIndex() - 1;
            // END
        }

        @Override
        public int nextIndex() {
            // BEGIN (write your solution here)
            return index;
            // END
        }

        @Override
        public void remove() {
            // BEGIN (write your solution here)

            // END
        }
    }

    private static class Item<T> {

        private T element;

        private Item<T> nextItem;

        private Item<T> prevItem;

        Item(final T element, final Item<T> prevItem, final Item<T> nextItem) {
            this.element = element;
            this.nextItem = nextItem;
            this.prevItem = prevItem;
        }

        public Item<T> getNextItem() {
            return nextItem;
        }

        public Item<T> getPrevItem() {
            return prevItem;
        }
    }
}
