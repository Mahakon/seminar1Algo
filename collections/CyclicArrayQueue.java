package seminar1.collections;

import java.util.Iterator;

public class CyclicArrayQueue<Item> implements IQueue<Item> {

    private Item[] elementData;
    private int tail = -1;
    private int head = -1;
    private int capacity = 10;
    private int size = 0;


    /*
     *shows all elements of queue
     */
    @Override
    public void out() {
        for(Item value : elementData) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /*
     * adds one element to the end of queue
     * ?(queue is empty) (?elementdata[0] is empty)
     * elementdata[0] = new element : grow();
     */
    @Override
    public void enqueue(Item item) {
        tail++;

        if (isEmpty()){
            elementData = (Item[]) new Integer[capacity];
            head = 0;
        }

        System.out.println();

        if (tail == capacity || size >= capacity) {
            if (head != 0) {
                Item[] newDate = (Item[]) new Integer[elementData.length];
                System.arraycopy(elementData, head, newDate, 0, size);
                elementData = newDate;
                head = 0;
                tail = head + size;
            } else {
                grow();
                head = 0;
            }
        }

        elementData[tail] = item;

        size++;
    }

    /*
     * deletes one element of the head of queue
     * ?(size <= capacity/4+1) shrink
     * returns first element
     */
    @Override
    public Item dequeue() {
        if (isEmpty()) {
            return null;
        }
        Item first = elementData[head];
        elementData[head] = null;
        head++;
        size--;

        if (size <= capacity / 4 + 1) {
            shrink();
            tail = size-1;
            head = 0;
        }



        return first;
    }

    /*
     * returns ? (queue is empty) true : false
    */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     * returns size of queue
    */
    @Override
    public int size() {
        return size;
    }

    /*
     * enlagers the capicity in 1,5
     */
    private void grow() {
        capacity = capacity * 3 / 2 + 1;
        Item[] oldDate = (Item[]) new Integer[size];
        System.arraycopy(elementData, 0, oldDate, 0, size);
        elementData = (Item[]) new Integer[capacity];
        System.arraycopy(oldDate, 0, elementData, 0, size);
    }

    /*
     * narrows capacity in 2
     */
    private void shrink() {
        capacity = capacity / 2 + 1;
        Item[] oldDate = (Item[]) new Integer[size];
        System.arraycopy(elementData, head, oldDate, 0, size);
        elementData = (Item[]) new Integer[capacity];
        System.arraycopy(oldDate, 0, elementData, 0, size);
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int cur = head;
            @Override
            public boolean hasNext() {

                if (cur > tail) {
                    return false;
                }
                return true;
            }

            @Override
            public Item next() {
                Item value = elementData[cur];
                cur++;
                return value;
            }
        };
    }
}
