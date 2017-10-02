/*
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

*/
/**
 * implements a randomizedqueue
 *//*

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Item[] queue;
    private int size;
    private int capacity;

    public RandomizedQueue() { // construct an empty randomized queue
        size = 0;
        capacity = 1;
        queue = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() { // is the queue empty?
        return size == 0;
    }

    public int size() { // return the number of items on the queue
        return size;
    }

    public void enqueue(Item item) {   // add the item
        if (item == null)
            throw new IllegalArgumentException("the item is null");
        if (size + 1 > capacity)
            resizeArray();
        queue[size++] = item;
    }

    private void resizeArray() {
        capacity *= 2;
        Item[] newQueue = (Item[]) new Object[capacity];
        int index = 0;
        for (Item i : queue) {
            newQueue[index++] = i;
        }
        queue = newQueue;
    }

    public Item dequeue() { // remove and return a random item
        if (isEmpty())
            throw new NoSuchElementException("the queue is empty");
        int randomIndex = StdRandom.uniform(size);
        Item result = queue[randomIndex];
        queue[randomIndex] = queue[size - 1];
        queue[size - 1] = null;
        size--;
        if (capacity / 4 > size)
            reDeuceArray();
        return result;
    }

    private void reDeuceArray() {
        capacity = capacity / 2;
        Item[] newQueue = (Item[]) new Object[capacity];
        int index = 0;
        for (int i = 0; i < capacity; i++) {
            newQueue[index++] = queue[i];
        }
        queue = newQueue;
    }

    public Item sample() {
        if (isEmpty())
            throw new NoSuchElementException("the queue is empty");
        return queue[StdRandom.uniform(size)];
    }                     // return (but do not remove) a random item

    private class RandomizedQueueIterator implements Iterator<Item> {
        private int current = 0;
        private int[] shuffledIndexes = new int[size];


        public boolean hasNext() {
            if (current == 0) {
                for (int i = 0; i < size; i++)
                    shuffledIndexes[i] = i;
                StdRandom.shuffle(shuffledIndexes);
            }
            return current < size;
        }

        public Item next() {
            if (current == 0) {
                for (int i = 0; i < size; i++)
                    shuffledIndexes[i] = i;
                StdRandom.shuffle(shuffledIndexes);
            }

            if (current >= size || isEmpty())
                throw new NoSuchElementException();
            return queue[shuffledIndexes[current++]];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }


    public static void main(String[] args) { // unit testing (optional)
        RandomizedQueue<Integer> randomizedQueue = new RandomizedQueue<Integer>();
        randomizedQueue.enqueue(2);
        randomizedQueue.enqueue(1);
        randomizedQueue.enqueue(3);
        randomizedQueue.enqueue(4);
        randomizedQueue.enqueue(5);
        randomizedQueue.dequeue();

        Iterator<Integer> iterator = randomizedQueue.iterator();
        while (iterator.hasNext()) {
            StdOut.println(iterator.next());
        }
*/
/*        for (Integer i : randomizedQueue) {
            StdOut.println(randomizedQueue.dequeue());
        }*//*

    }

}
*/
