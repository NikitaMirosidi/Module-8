import java.util.Arrays;
public class MyArrayList<T> {
    private final int DEFAULT_CAPACITY = 5;
    private final T[] DEFAULT_CAPACITY_VAULT = (T[]) new Object[DEFAULT_CAPACITY];
    private T[] vault;
    private int capacity;
    private int size = 0;

    public MyArrayList(int size) {

        this.capacity = size;
        this.vault = (T[]) new Object[size];
    }

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.vault = DEFAULT_CAPACITY_VAULT;

    }


    public void add(T value){
        if (size < capacity) {
            vault[size] = value;
        }
        else {
            capacity++;
            vault = Arrays.copyOf(vault, capacity);
            vault[capacity - 1] = value;
        }
        System.out.println("Элемент <" + value + "> под индексом <" + size + "> добавлен в коллекцию");
        size++;
        System.out.println("Размер коллекции: " + size);
    }

    public void remove(int index){
        if (index >= 0 && index < size) {
            T temp = vault[index];
            System.arraycopy(vault, index +1, vault, index, capacity - index - 1);
            vault[capacity - 1] = null;
            System.out.println("Элемент под индеком " + index + ": <" + temp + "> - удален");
            size--;
        }
        else {
            System.out.println("Элемент под таким индексом в данной коллекции отсутствует");
        }
    }

    public void clear(){
        System.out.println(size);
        System.out.println(capacity);
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                vault[i] = null;
            }
            size = 0;
            System.out.println("Коллекция очищена");
        }
        else {
            System.out.println("Коллекция и так пуста");
        }
    }

    public int size(){
        return size;
    }

    public T get(int index){
        if (index >= 0 && index < size) {
            return vault[index];
        }
        else {
            System.out.println("Несуществующий индекс");
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        /*for (T temp : vault){ //коллекция размером capacity
            result.append(temp).append(" ");
        }*/

        for (int i = 0; i < size; i++){ //коллекция размером capacity
            result.append(vault[i]).append(" ");
        }
        return new String("Коллекция: "+ result.toString()).trim();
    }
}