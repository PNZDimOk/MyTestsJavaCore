package thread_safe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CuncurentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
//        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Dmitrii");
        map.put(2, "Ivan");
        map.put(3, "Oleg");
        map.put(4, "Daria");
        map.put(5, "Stepan");
        System.out.println(map);

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ";" + map.get(i));
            }
        };
        Runnable runnable1 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6,"Elena");
            System.out.println("Runnable1 ends");
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
