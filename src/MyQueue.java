public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public MyQueue(int size) {
        this.head = null;
        this.tail = null;
        this.size = size;
    }

    void add(T value){
        final Node<T> TEMP = tail;
        final Node<T> NEW_NODE = new Node<>(null, TEMP, value);
        tail = NEW_NODE;

        if (head == null) {
            head = NEW_NODE;
        }
        else {
            TEMP.next = NEW_NODE;
        }
        size++;
    }

    void remove(int index) {
        if (index >= 0 && index < size) {
            Node<T> temp = head;
            int count = index;

            while (count > 0) {
                temp = temp.next;
                count--;
            }
            Node<T> tempNext = temp.next;
            Node<T> tempPrev = temp.prev;
            tempNext.prev = temp.prev;
            tempPrev.next = temp.next;
            temp.vault = null;
            size--;
            System.out.println("Элемент удален");
        }
        else {
            System.out.println("Элемент не найден");
        }
    }

    public void clear() {
        if (head != null) {
            for (Node<T> temp = head; temp != null; ) {
                Node<T> next = temp.next;
                temp.prev = null;
                temp.next = null;
                temp.vault = null;
                temp = next;
            }
            head = tail = null;
            size = 0;
            System.out.println("Коллекция очищена");
        }
        else {
            System.out.println("Коллекция и так пуста");
        }
    }

    public int size() {
        return size;
    }

    public T peek() {
        return head.vault;
    }

    public T poll() {
        Node<T> temp = head;
        head = temp.next;
        head.prev = null;
        size--;
        return temp.vault;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "Коллекция пуста";
        }
        else{
            return collectCollection(head).trim();
        }
    }

    private String collectCollection (Node<T> node) {
        if (node != null) {
            return node.vault.toString() + " " + collectCollection(node.next);
        }
        else {
            return "";
        }
    }

    private static class Node<T> {
        private Node<T> next;
        private Node<T> prev;
        private T vault;
        public Node (Node<T> next, Node<T> prev, T vault) {
            this.next = next;
            this.prev = prev;
            this.vault = vault;
        }
    }
}