import java.util.NoSuchElementException;

public class MyHashMap<K, V> {
    private int size = 0;
    private int capacity;
    private Node<K, V>[] table;

    public MyHashMap() {
        this.capacity = 16;
        this.table = new Node[16];
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.table = new Node[capacity];
    }

    public void put(K key, V vault) {
        if (key == null) {
            if (table[0] == null) {
                table[0] = new Node<>(0, null, vault);
                size++;
                System.out.println("Элемент добавлен");
            }
            else {
                table[0].vault = vault;
                System.out.println("Значение элемента обновлено");
            }
        }
        else {
            int hash = key.hashCode();
            int index = 1 + hash / (Integer.MAX_VALUE / (capacity - 2));

            if (table[index] == null) {
                table[index] = new Node<>(hash, key, vault);
                size++;
                System.out.println("Элемент добавлен");
            }
            else {
                Node<K, V> temp = table[index];

                while (true) {
                    if (temp.key.equals(key)) {
                        temp.vault = vault;
                        System.out.println("Значение элемента обновлено");
                        return;
                    }

                    if (temp.next == null) {
                        temp.next = new Node<>(hash, key, vault);
                        size++;
                        System.out.println("Элемент добавлен");
                        return;
                    }
                    else {
                        temp = temp.next;
                    }
                }
            }
        }
    }

    public void remove(K key) {
        if (key == null) {
            table[0].vault = null;
            table[0].next = null;
            table[0] = null;
            size--;
            System.out.println("Элемент удален");
        }
        else {
            int hash = key.hashCode();
            int index = 1 + hash / (Integer.MAX_VALUE / (capacity - 2));

            if (table[index].key.equals(key)) {
                Node<K, V> temp = table[index].next;
                table[index].vault = null;
                table[index].next = null;
                table[index] = temp;
                size--;
                System.out.println("Элемент удален");
                return;
            } else {
                Node<K, V> tempPrev = table[index];
                Node<K, V> temp = tempPrev.next;

                while (temp != null) {
                    if (temp.key.equals(key)) {
                        temp.vault = null;
                        tempPrev.next = temp.next;
                        size--;
                        System.out.println("Элемент удален");
                        return;
                    }
                    else {
                        tempPrev = temp;
                        temp = tempPrev.next;
                    }
                }
            }
            System.out.println("Элемент не найден");
        }
    }

    public void clear() {
        if(size != 0) {
            for (int i = 0; i < capacity; i++) {
                if (table[i] != null) {
                    Node<K, V> temp = table[i].next;
                    table[i].vault = null;
                    table[i].next = null;
                    table[i] = null;
                    size--;

                    while (temp != null) {
                        Node<K, V> tempNext = temp.next;
                        temp.vault = null;
                        temp.next = null;
                        temp = tempNext;
                        size--;
                    }
                }
            }
            capacity = 0;
            table = null;
            System.out.println("Коллекция очищена");
        }
        else {
            System.out.println("Коллекция и так пуста");
        }
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        if (key == null) {
            return table[0].vault;
        }
        else {
            int hash = key.hashCode();
            int index = 1 + hash / (Integer.MAX_VALUE / (capacity - 2));
            Node<K, V> temp = table[index];

            do {
                if (temp.key.equals(key)) {
                    return temp.vault;
                }
                temp = temp.next;
            } while (temp != null);
            throw new NoSuchElementException();
        }
    }

    private static class Node<K, V> {
       private final int hash;
       private final K key;
       private V vault;
       private Node<K, V> next;

        public Node(int hash, K key, V vault) {
            this.hash = hash;
            this.key = key;
            this.vault = vault;
            this.next = null;
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Коллекция пуста";
        } else {
            StringBuilder str = new StringBuilder("");
            int i = 0;

            for (Node<K, V> temp : table) {
                str.append("Бакет ").append(i).append(":\n");
                i++;

                while (temp != null) {
                    str.append(temp.vault.toString()).append(" | ");
                    temp = temp.next;
                }
                str.append("\n");
            }
            return str.toString();
        }
    }
}