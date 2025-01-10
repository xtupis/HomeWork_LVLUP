package hw_gen;

public class Appearance <T extends Comparable, V extends Animal & Serializable, K extends Number> {
    public T t;
    public V v;
    public K k;

    public Appearance(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T printToConsole_T() {

        return this.t;
    }

    public V printToConsole_R() {
        return this.v;
    }

    public K printToConsole_K() {
        return this.k;
    }

    public void printToConsoleAll() {
        System.out.println("Имя1: " + t.getClass().getName());
        System.out.println("Имя2: " + v.getClass().getName());
        System.out.println("Имя3: " + k.getClass().getName());
    }
}

