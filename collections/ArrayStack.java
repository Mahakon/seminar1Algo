package seminar1.collections;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<Item> implements IStack<Item> {

    private static final int DEFAULT_CAPACITY = 10;

    private Item[] elementData;
    private int size = 0;
    private int head = -1;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        this.elementData = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void push(Item item) {
        size++;
        if (size > elementData.length) {
            grow();
        }
        elementData[++head] = item;
    }

    @Override
    public Item pop() {
        if (isEmpty()) {
            return null;
        }
        size--;
        if (size < elementData.length/4 + 1) {
            shrink();
        }
        Item h = elementData[head];
        elementData[head] = null;
        head--;
        return h;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void grow() {
        Item[] newDate = (Item[]) new Integer[elementData.length];
        System.arraycopy(elementData, 0, newDate, 0, elementData.length);
        changeCapacity(elementData.length*3/2 + 1);
        System.arraycopy(newDate, 0, elementData, 0, newDate.length);
    }

    private void shrink() {
        Item[] newDate = (Item[]) new Integer[size];
        System.arraycopy(elementData, 0, newDate, 0, size);
        changeCapacity(elementData.length/2 + 1);
        System.arraycopy(newDate, 0, elementData, 0, newDate.length);
    }

    private void changeCapacity(int newCapacity) {
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<Item> {

        private int currentPosition = size;

        @Override
        public boolean hasNext() {
            return currentPosition != 0;
        }

        @Override
        public Item next() {
            return elementData[--currentPosition];
        }

    }

}
