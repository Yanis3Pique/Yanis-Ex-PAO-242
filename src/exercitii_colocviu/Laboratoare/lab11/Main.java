package exercitii_colocviu.Laboratoare.lab11;

import lab11.MyCache;
import lab11.StoredObject;

public class Main {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();

        StoredObject obj1 = new StoredObject("First object", 5000);
        StoredObject obj2 = new StoredObject("Second object", 10000);

        myCache.addObject(obj1);
        myCache.addObject(obj2);

        myCache.start();
        for(int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100);
                StoredObject storedObject = new StoredObject("Object " + (i + 2), 300);
                myCache.addObject(storedObject);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
