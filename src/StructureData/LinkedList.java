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
        if (firstInList == null) {
            return false;
        }
        for (T elementInItem : this) {
            if (Objects.equals(o, elementInItem)) {
                return true;
            }
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
        final T[] newM = (T[]) new Object[this.size()];
        int i = 0;

        for (T element : this) {
            newM[i++] = element;
        }
        return newM;
        // END
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        // BEGIN (write your solution here)
        if (a.length < size) {
            a = (T1[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }
        int i = 0;
        Object[] result = a;
        for (Item<T> x = firstInList; x != null; x = x.nextItem) {
            result[i++] = x.element;
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
        if (this.size() == 0) {
            this.firstInList = new Item<>(newElement, null, null);
            this.lastInList = firstInList;
        } else if (this.size() == 1) {
            this.lastInList = new Item<>(newElement, this.firstInList, null);
            this.firstInList.nextItem = this.lastInList;
        } else {
            final Item<T> newLast = new Item<>(newElement, this.lastInList, null);
            this.lastInList.nextItem = newLast;
            this.lastInList = newLast;
        }
        size++;
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
        if (size == 0) {
            return false;
        }

        Item<T> current = this.firstInList;
        while (current.nextItem != null && !current.element.equals(o)) {
            current = current.nextItem;
        }

        if (current.element.equals(o)) {
            if (this.size() == 1) {
                this.firstInList = null;
                this.lastInList = null;
            } else {
                if (current == firstInList) {
                    firstInList = current.nextItem;
                    firstInList.prevItem = null;
                }
                if (current == lastInList) {
                    lastInList = current.prevItem;
                    lastInList.nextItem = null;
                }
                if (current.nextItem != null && current.prevItem != null) {
                    current.prevItem.nextItem = current.nextItem;
                    current.nextItem.prevItem = current.prevItem;
                }
            }
            size--;
            return true;
        }
        return false;
        // END
    }

    @Override
    public T remove(final int index) throws IndexOutOfBoundsException {
        // BEGIN (write your solution here)
        int i = 0;
        if (size <= index || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Item<T> current = this.firstInList;

        while (i != index) {
            current = current.nextItem;
            i++;
        }

        if (current != null) {
            if (this.size() == 1) {
                this.firstInList = null;
                this.lastInList = null;
            } else {
                if (current == firstInList) {
                    firstInList = current.nextItem;
                    firstInList.prevItem = null;
                }
                if (current == lastInList) {
                    lastInList = current.prevItem;
                    lastInList.nextItem = null;
                }
                if (current.nextItem != null && current.prevItem != null) {
                    current.prevItem.nextItem = current.nextItem;
                    current.nextItem.prevItem = current.prevItem;
                }
            }
            size--;
            return current.element;
        }
        return null;
        // END
    }

    private void remove(final Item<T> current) {
        // BEGIN (write your solution here)
        if (current != null) {
            if (this.size() == 1) {
                firstInList = null;
                lastInList = null;
            } else {
                if (current == firstInList) {
                    firstInList = current.nextItem;
                    current.prevItem = null;
                }
                if (current == lastInList) {
                    lastInList = current.prevItem;
                    current.nextItem = null;
                }
                if (current.nextItem != null && current.prevItem != null) {
                    current.prevItem.nextItem = current.nextItem;
                    current.nextItem.prevItem = current.prevItem;
                }
            }
            size--;
        }
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
        for (Item<T> x = firstInList; x != null;) {
            Item next = x.nextItem;
            x.element = null;
            x.nextItem = null;
            x.prevItem = null;
            x = next;
        }
        firstInList = lastInList = null;
        size = 0;
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
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        final Item<T> item = getItemByIndex(index);
        T tempElem = item.element; //переменная которая хранит ссылку на поле element класса Item
        item.element = element;
        return tempElem;
        // END
    }

    @Override
    public T get(final int index) {
        // BEGIN (write your solution here)
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return getItemByIndex(index).element;
        // END
    }

    private Item<T> getItemByIndex(final int index) {
        // BEGIN (write your solution here) An auxiliary method for searching for node by index.
        int i = 0;
        Item<T> current = firstInList;
        while (i != index) {
            current = current.nextItem;
            i++;
        }
        return current;
        // END
    }

    private class ElementsIterator implements ListIterator<T> {

        private Item<T> currentItemInIterator;

        private Item<T> lastReturnedItemFromIterator;

        private int index;

        ElementsIterator(final int index) {
            // BEGIN (write your solution here)
            this.currentItemInIterator = (index == size) ? null : getItemByIndex(index);
            this.index = index;
            // END
        }

        @Override
        public boolean hasNext() {
            // BEGIN (write your solution here)
            return this.index < size;
            // END
        }

        @Override
        public T next() {
            // BEGIN (write your solution here)
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            lastReturnedItemFromIterator = currentItemInIterator;
            currentItemInIterator = currentItemInIterator.getNextItem();
            index++;
            return lastReturnedItemFromIterator.element;
            // END
        }

        @Override
        public boolean hasPrevious() {
            // BEGIN (write your solution here)
            return index > 0;
            // END
        }

        @Override
        public T previous() {
            // BEGIN (write your solution here)
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            if (currentItemInIterator == null) {
                currentItemInIterator = lastReturnedItemFromIterator = lastInList;
            } else {
                lastReturnedItemFromIterator
                        = currentItemInIterator
                        = currentItemInIterator.getPrevItem();
            }
            index--;
            return lastReturnedItemFromIterator.element;
            // END
        }

        @Override
        public void add(final T element) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(final T element) {
            // BEGIN (write your solution here)
            if (lastReturnedItemFromIterator == null) {
                throw new IllegalStateException();
            }
            lastReturnedItemFromIterator.element = element;
            // END
        }

        @Override
        public int previousIndex() {
            // BEGIN (write your solution here)
            return index - 1;
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
            if (lastReturnedItemFromIterator == null) {
                throw new IllegalStateException();
            }
            LinkedList.this.remove(lastReturnedItemFromIterator);
            lastReturnedItemFromIterator = null;
            index--;
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
