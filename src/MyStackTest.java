public class MyStackTest {
    public void integerTest() {
        MyStack<Integer> my1 = new MyStack<>();
        //MyStack<Integer> my1 = new MyStack<>(30);

        System.out.println("Тест Integer коллекции");
        System.out.println("Размер коллекции: " + my1.size());

        for (int i = 0; i < 40; i++) {
            my1.push(i + 1);
            System.out.print(i + 1 + " ");
        }

        System.out.println();
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());

        System.out.println();
        System.out.println(my1.peek());
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());
        System.out.println(my1.poll());
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());
        System.out.println(my1.peek());
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());
        System.out.println(my1.poll());
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());
        System.out.println(my1.peek());
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());
        System.out.println(my1.poll());
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());

        System.out.println();
        my1.remove(2);
        my1.remove(10);
        my1.remove(36);
        my1.remove(-8);
        my1.remove(646534);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());

        System.out.println();
        my1.clear();
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());
    }
}
