import java.util.NoSuchElementException;

public class MyHashMapTest {
    public void integerTest() {
        MyHashMap<Integer, String > my1 = new MyHashMap<>();
        //MyHashMap<Integer> my1 = new MyHashMap<>(30);

        /*System.out.println(Integer.MAX_VALUE / 15);
        System.out.println((Integer.MAX_VALUE / 15) * 2);
        System.out.println((Integer.MAX_VALUE / 15) * 3);
        System.out.println((Integer.MAX_VALUE / 15) * 4);
        System.out.println((Integer.MAX_VALUE / 15) * 5);
        System.out.println((Integer.MAX_VALUE / 15) * 6);
        System.out.println((Integer.MAX_VALUE / 15) * 7);
        System.out.println((Integer.MAX_VALUE / 15) * 8);
        System.out.println((Integer.MAX_VALUE / 15) * 9);
        System.out.println((Integer.MAX_VALUE / 15) * 10);
        System.out.println((Integer.MAX_VALUE / 15) * 11);
        System.out.println((Integer.MAX_VALUE / 15) * 12);
        System.out.println((Integer.MAX_VALUE / 15) * 13);
        System.out.println((Integer.MAX_VALUE / 15) * 14);*/

        System.out.println("Тест Integer коллекции");
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());
        System.out.println();

        my1.put(143165576, "Один");
        my1.put(143165575, "Два");
        my1.put(286331152, "Три");
        my1.put(286331151, "Четыре");
        my1.put(0, "Пять");
        my1.put(null, "Шесть");
        my1.put(429496728, "Семь");
        my1.put(429496727, "Восемь");
        my1.put(572662304, "Девять");
        my1.put(572662303, "Десять");
        my1.put(715827880, "Одинадцать");
        my1.put(715827879, "Двенадцать");
        my1.put(858993456, "Тринадцать");
        my1.put(858993457, "Четырнадцать");
        my1.put(1002159032, "Пятнадцать");
        my1.put(1002159031, "Шестнадцать");
        my1.put(1145324608, "Семнадцать");
        my1.put(1145324607, "Восемнадцать");
        my1.put(1288490184, "Девятнадцать");
        my1.put(1288490183, "Двадцать");
        my1.put(1431655760, "Двадцать один");
        my1.put(1431655759, "Двадцать два");
        my1.put(1574821336, "Двадцать три");
        my1.put(1574821335, "Двадцать четыре");
        my1.put(1717986912, "Двадцать пять");
        my1.put(1717986911, "Двадцать шесть");
        my1.put(1861152488, "Двадцать семь");
        my1.put(1861152487, "Двадцать восемь");
        my1.put(2004318064, "Двадцать девять");
        my1.put(2004318063, "Тридцать");
        my1.put(Integer.MAX_VALUE, "Тридцать один");
        my1.put(Integer.MAX_VALUE - 1, "Тридцать два");

        System.out.println();

        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция:\n" + my1.toString());

        try {
            System.out.println(my1.get(715827879));
            System.out.println(my1.get(1288490184));
            System.out.println(my1.get(4212));
        }
        catch (NoSuchElementException e) {
            System.out.println("По указанному ключу элемент в коллекции не найден");
        }

        System.out.println();
        my1.put(715827879, "Замена");
        my1.put(1288490184, "Замена");

        try {
            System.out.println(my1.get(715827879));
            System.out.println(my1.get(1288490184));
            System.out.println(my1.get(735235));
        }
        catch (NoSuchElementException e) {
            System.out.println("По указанному ключу элемент в коллекции не найден");
        }

        System.out.println();
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция:\n" + my1.toString());

        my1.remove(1717986912);
        System.out.println("Размер коллекции: " + my1.size());
        my1.remove(572662303);
        System.out.println("Размер коллекции: " + my1.size());
        my1.remove(2004318064);
        System.out.println("Размер коллекции: " + my1.size());
        my1.remove(2368578);
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println();

        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция:\n" + my1.toString());

        my1.clear();
        System.out.println("Размер коллекции: " + my1.size());
        System.out.println("Коллекция: " + my1.toString());
    }
}
