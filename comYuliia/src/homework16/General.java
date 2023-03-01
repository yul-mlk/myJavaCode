package homework16;

public class General<E> {

    public E element;

    public General(E element) {
        this.element = element;
    }

    public General() {
    }

    public E[] arrays;

    public E[] getArrays() {
        return arrays;
    }

    public static void main(String[] args) {
        General<Object> entArrays = new General<>();
        entArrays.arrays = new Object[8];
        entArrays.arrays[0] = new Teacher(1, "Alex");
        entArrays.arrays[1] = new Lecture(3, "Methods");
        entArrays.arrays[2] = new Lecture(4, "Constructor");
        entArrays.arrays[3] = new Lecture(5, "Generics");
        entArrays.arrays[4] = new Student(1, "Alina");
        entArrays.arrays[5] = new Student(2, "Denis");
        entArrays.arrays[6] = new Student(3, "Iryna");
        entArrays.arrays[7] = new Student(4, "Danilo");

        for (int i = 0; i < entArrays.arrays.length; i++) {
            System.out.println(entArrays.arrays[i]);
        }
        System.out.println("_____");

        SimpleIterator<Object> iterator1 = new SimpleIterator<>(entArrays.arrays);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("__________");
        iterator1.remove(1);
        System.out.println("_________________");

        for (int i = 0; i < entArrays.arrays.length; i++) {
            System.out.println(entArrays.arrays[i]);
        }
    }
}


