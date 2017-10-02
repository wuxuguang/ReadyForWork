/*
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

*/
/**
 * implements the double-ended queue or deque
 *//*

public class Deque<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int n;

    private class Node{
        private Item item;
        private Node prev;
        private Node next;
    }




    public Deque(){ // construct an empty deque
        first = null;
        last = null;
        n = 0;
    }
    public boolean isEmpty(){ // is the deque empty?
        return n == 0;
    }
    public int size(){ // return the number of items on the deque
        return n;
    }
    public void addFirst(Item item){ // add the item to the front
        if (item == null)
            throw new IllegalArgumentException("the item is null");
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.prev = null;
        first.next = oldFirst;
        if (isEmpty())
            last = first;
        else
            oldFirst.prev = first;
        n++;
    }
    public void addLast(Item item){ // add the item to the end
        if (item == null)
            throw new IllegalArgumentException("the item is null");
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        last.prev = oldLast;
        if (isEmpty())
            first = last;
        else
            oldLast.next = last;
        n++;
    }

    public Item removeFirst()   { // remove and return the item from the front
        if (isEmpty())
            throw new NoSuchElementException("the deque is empty");
        Node oldFirst = first;
        first = first.next;
        n--;
        if (isEmpty())
            last = first;
        else
            first.prev = null;
        return oldFirst.item;
    }
    public Item removeLast() {             // remove and return the item from the end
        if (isEmpty())
            throw new NoSuchElementException("the deque is empty");
        Node oldLast = last;
        last = last.prev;
        n--;
        if (isEmpty())
            first = last;
        else
            last.next = null;
        return oldLast.item;
    }

    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return !(current == null);
        }

        public Item next() {
            if (!hasNext())
                throw new NoSuchElementException("no item in the deque");
            Node oldFirst = current;
            current = current.next;
            return oldFirst.item;
        }

        public void remove() {
            throw new UnsupportedOperationException("remove in iterator is not supported");
        }
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();
        deque.size();
        deque.size();
        deque.addLast(2);
        deque.isEmpty();
        deque.removeLast();
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            StdOut.println(iterator.next());
        }
    }
}
*/
