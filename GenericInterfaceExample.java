interface container<T> {
    void add(T item);
    T get();
}
class Box<T> implements container<T> {
    private T item;
    public void add(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
}
public class GenericInterfaceExample {
    public static void main(String[] args) {
        container<String> stringBox = new Box<>();
        stringBox.add("Interface Example");
        System.out.println("Box Contains: " + stringBox.get());
    }
}