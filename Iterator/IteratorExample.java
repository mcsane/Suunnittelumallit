import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // a) Iteroidaan kokoelmaa kahdella säikeellä, joilla kummallakin on oma iterattori
        Runnable task = () -> {
            try {
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                    Thread.sleep(100); 
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
        // b) Sama iteraattori vuorotellen
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // c) Kokoelmaan tehdään muutoksia iteroinnin aikana
        try {
            Iterator<Integer> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                System.out.println(iterator2.next());
                list.add(4); 
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException: Kokoelmaa muutettiin iteroinnin aikana.");
        }
        // d) Iteraattorin remove-metodi
        Iterator<Integer> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            int value = iterator3.next();
            if (value % 2 == 0) {
                iterator3.remove();
            }
        }

        // Tulostetaan muokattu lista
        System.out.println("Muokattu lista:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // d) forEachRemaining-metodi
        Iterator<Integer> iterator4 = list.iterator();
        iterator4.forEachRemaining(num -> System.out.println("forEachRemaining: " + num));

    }};