public class MyArrayListTest {
    public void integerTest() {
        MyArrayList<Integer> my1 = new MyArrayList<>();
        //MyArrayList<Integer> my1 = new MyArrayList<>(20);

        System.out.println("Тест Integer коллекции");
        System.out.println("Размер коллекции: " + my1.size());

        for (int i = 0; i < 40; i++) {
            my1.add(i + 1);
        }

        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());

        my1.remove(1);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        my1.remove(9);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        my1.remove(24);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        my1.remove(43);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        my1.remove(34);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());

        System.out.println(my1.get(5));
        System.out.println(my1.get(21));
        System.out.println(my1.get(0));
        System.out.println(my1.get(-23));
        System.out.println(my1.get(142));

        my1.clear();
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        System.out.println();
    }

    public void stringTest() {
        MyArrayList<String> my1 = new MyArrayList<>();
        //MyArrayList<String> my1 = new MyArrayList<String>(21);

        System.out.println("Тест String коллекции");
        System.out.println("Размер коллекции: " + my1.size());

        my1.add("один");
        my1.add("два");
        my1.add("три");
        my1.add("четыре");
        my1.add("пять");
        my1.add("шесть");
        my1.add("семь");
        my1.add("восемь");
        my1.add("девять");
        my1.add("десять");
        my1.add("одинадцать");
        my1.add("двенадцать");
        my1.add("тринадцать");

        System.out.println(my1.toString());

        my1.remove(1);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        my1.remove(9);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        my1.remove(24);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        my1.remove(43);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        my1.remove(12);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());

        System.out.println(my1.get(3));
        System.out.println(my1.get(10));
        System.out.println(my1.get(0));
        System.out.println(my1.get(-23));
        System.out.println(my1.get(142));

        my1.clear();
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println(my1.toString());
        System.out.println();
    }
}
