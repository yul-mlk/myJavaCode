package homeWork13;

import java.util.Arrays;

public class General<E> {
    public E element;

    public General(E element) {
        this.element = element;
    }

    public General() {
    }

    public E[] arrays;

    public General(E[] arrays) {
        this.arrays = arrays;
    }

    public E[] getArrays() {
        return arrays;
    }

    public void info() {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public int size() {
        return this.arrays.length;
    }

    public boolean isEmpty() {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != null) {
                return false;
            }
        }
        return true;
    }

    public E get(int index) {
        for (int i = 0; i < arrays.length; i++) {
            if (index == i) {
                return arrays[i];
            }
        }
        return null;
    }

    public void add(E element) {
        for (int i = 0; i < arrays.length; i++) {
            this.arrays[0] = element;
            System.out.println(arrays[i]);
        }
    }

    public void add1(E element) {
        for (int i = 0; i < arrays.length; i++) {
            this.arrays[i] = element;
            System.out.println(arrays[i]);

        }
    }

    public void add(int index, E element) {
        for (int i = 0; i < arrays.length; i++) {
            if (index == i) {
                arrays[index] = element;
                System.out.println(arrays[i]);
                System.out.println(Arrays.toString(arrays));

            }
        }
    }

    public void remove(int index) {
        for (int i = 0; i < arrays.length; i++) {
            if (index == i) {
                arrays[index] = null;
                System.out.println(arrays[i]);
                System.out.println(Arrays.toString(arrays));
            }

        }
    }
}

