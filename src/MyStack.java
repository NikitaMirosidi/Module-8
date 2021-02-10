public class MyStack<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyStack() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public MyStack(int size) {
        this.head = null;
        this.tail = null;
        this.size = size;
    }

    void push(T value){
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
                count--;            }

            Node<T> tempNext = temp.next;
            Node<T> tempPrev = temp.prev;
            tempNext.prev = temp.prev;
            tempPrev.next = temp.next;
            T toShow = temp.vault;
            temp.vault = null;
            temp = null;
            size--;
            System.out.println("Элемент коллекции под индексом <" + index + "> со значением <" + toShow + "> удален");
        }
        else {
            System.out.println("Элемент под указанным индексом отсутствует в коллекции");
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
        return tail.vault;
    }

    public T poll() {
        Node<T> temp = tail;
        tail = temp.prev;
        tail.next = null;
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