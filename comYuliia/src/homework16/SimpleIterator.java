package homework16;

import java.util.*;

public class SimpleIterator<E> {
    int index;
    public E[] current;

    public SimpleIterator(E[] current) {
        this.current = current;
    }

    public SimpleIterator(int index, E[] current) {
        this.index = index;
        this.current = current;
    }

    public SimpleIterator() {

    }

    public E[] getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        return "SimpleIterator{" +
                "index=" + index +
                ", current=" + Arrays.toString(current) +
                '}';
    }

    public boolean hasNext() {
        for (E e : current) {
            if (index++ < current.length)
                return true;
        }
        return false;
    }

    public E next() {
        try {
            return current[index++];
        } catch (NoSuchElementException e) {
            System.out.println("An exception was caught " + e);
            throw new NoSuchElementException();
        }
    }

    public void remove(int index) {
        try {
            current[index] = null;
            System.out.println("Removed index " + index + " = " + current[index]);
        } catch (NoSuchElementException e) {
            System.out.println("An exception was caught " + e);
            throw new NoSuchElementException();
        }
    }
}