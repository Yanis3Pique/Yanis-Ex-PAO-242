package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grila4 {
    public static void main(String[] args) {
        List<Integer> numere = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numere.add(i);
        }

        Iterator<Integer> itr = numere.iterator();
        while (itr.hasNext()) {
            Integer nr = itr.next();
            if (nr % 2 == 0) {
                itr.remove();
            }
        }

        System.out.println(numere);
    }

//    public static void Main2(String[] args) {
//        List<Integer> numere = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            numere.add(i);
//        }
//
//        for (Integer nr : numere) {
//            if (nr % 2 == 0) {
//                numere.remove(nr); // Aceasta linie va cauza ConcurrentModificationException la executare
//            }
//        }
//
//        System.out.println(numere);
//    }
}
