package seminar1;

import java.util.Comparator;

import seminar1.collections.ArrayPriorityQueue;
import seminar1.collections.ArrayStack;
import seminar1.collections.CyclicArrayDeque;
import seminar1.collections.CyclicArrayQueue;
import seminar1.collections.IDeque;
import seminar1.collections.IPriorityQueue;
import seminar1.collections.IQueue;
import seminar1.collections.IStack;
import seminar1.collections.LinkedDeque;
import seminar1.collections.LinkedQueue;
import seminar1.collections.LinkedStack;
import seminar1.collections.TwoStackQueue;

public class Main {

    public static void main(String[] args) {
        //Test for LinkedQueue
        /*System.out.println("LinkedQueue");
        IQueue<Integer> queue = new LinkedQueue<>();
        for (int i = 0; i < 4; i++) {
            queue.enqueue(i);
        }
       for (int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
        queue.out();
        for (int i = 0; i < 5; i++) {
            System.out.print(queue.dequeue() + " ");
        }*/

        //Test for LinkedDeque
        /*System.out.println();
        System.out.println("LinkedDeque");
        IDeque<Integer> deque = new LinkedDeque<>();
        for (int i = 0; i < 4; i++) {
            deque.pushBack(i);
        }
        //deque.out();
        for (int i : deque) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(deque.popBack() + " ");
        }
        System.out.println();*/

        //Test CyclicArrayQueue
        /*System.out.println("CyclicArrayQueue");
        IQueue<Integer> caqueue = new CyclicArrayQueue<>();
        for (int i = 0; i < 14; i++) {
            caqueue.enqueue(i);
        }

        caqueue.out();
        for (int i : caqueue) {
            System.out.print(i + " ");
        }
        //caqueue.out();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            caqueue.dequeue();
            caqueue.out();
            System.out.println();
            for (int j : caqueue) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 7; i++) {
            caqueue.enqueue(i);
            caqueue.out();
            System.out.println();

            for (int j : caqueue) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            caqueue.dequeue();
            caqueue.out();
        }
        for (int i = 0; i < 10; i++) {
            caqueue.enqueue(i);
            caqueue.out();
        }*/

        //Test LinkedStack
        /*IStack<Integer> stack = new LinkedStack<>();
        for (int i = 0; i < 4; i++) {
            stack.push(i);
        }
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop() + " ");
        }*/

        //Test TwoStackQueue
        /*IQueue<Integer> twostackqueue = new TwoStackQueue<>();
        for (int i = 0; i < 4; i++) {
            twostackqueue.enqueue(i);
        }
        //System.out.println(twostackqueue.dequeue());
        //System.out.println(twostackqueue.dequeue());
        System.out.println();
        for(int i: twostackqueue) {
            System.out.print(i + " ");
        }*/

        //Test ArrayStack
        /*IStack<Integer> arraystack = new ArrayStack<>();
        for (int i = 0; i < 12; i++) {
            arraystack.push(i);
        }
        for (int i = 0; i < 13; i++) {
            System.out.println(arraystack.pop());
        }
        for (int i: arraystack) {
            System.out.print(i + " ");
        }*/
        //Test CyclicArrayDeque
        /*IDeque<Integer> cyclicarraydeque = new CyclicArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            cyclicarraydeque.pushFront(i);
        }
        for (int i = 0; i < 3; i++) {
            cyclicarraydeque.pushBack(7);
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(cyclicarraydeque.popFront() + " ");
        }
        cyclicarraydeque.out();
        for (int i = 0; i < 6; i++){
            cyclicarraydeque.pushBack(9);
        }
        cyclicarraydeque.out();
        System.out.println();

        for (int i : cyclicarraydeque) {
            System.out.print(i + " ");
        }*/

        //Test ArrayPriorityQueue
        /*IPriorityQueue<Integer> arraypriorityqueue = new ArrayPriorityQueue<>((Integer x, Integer y) -> x <= y ? x.equals(y) ? 0 : 1 : -1);

        for (int i = 0; i < 5; i++) {
            arraypriorityqueue.add(i);
        }
        arraypriorityqueue.add(-1);
        arraypriorityqueue.add(-3);
        for (int i = 0; i < 5; i++) {
            for (int j : arraypriorityqueue) {
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println(arraypriorityqueue.extractMin());
        }
        for (int i : arraypriorityqueue) {
            System.out.print(i + " ");
        }*/
    }
}
