package iterators;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable {
    private T[] items;
    private int size;

    public OurGenericList() {
        this.items = (T[]) new Object[100];
        this.size = 0;
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator {
        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("hasNext called");
            return index < list.size;
        }

        @Override
        public T next() {
            System.out.println("next called");
            return items[index++];
        }
    }
}