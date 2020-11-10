package JavaAdvancedLecture6.ExProblem5;
public class Box<E extends Comparable<E>> implements Comparable<E> {
    private E data;


    public Box(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    @Override
    public String toString() {
        return this.data.getClass().getName() + ": " + this.data;
    }

    @Override
    public int compareTo(E o) {

        return data.compareTo(o);
    }
}