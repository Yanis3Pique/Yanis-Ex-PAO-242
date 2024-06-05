package exercitii_colocviu.Laboratoare.lab10.Ex3;

import java.util.*;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        Magazin[] magazine = new Magazin[8];
        magazine[0] = new Magazin("Magazin1", 10);
        magazine[1] = new Magazin("Magazin2", 10);
        magazine[2] = new Magazin("Magazin2", 30);
        magazine[3] = new Magazin("Magazin5", 40);
        magazine[4] = new Magazin("Magazin5", 50);
        magazine[5] = new Magazin("Magazin6", 50);
        magazine[6] = new Magazin("Magazin7", 50);
        magazine[7] = new Magazin("Magazin5", 100);

        Map<Integer, List<Magazin>> magazinMap = Arrays.stream(magazine).collect(Collectors.groupingBy(Magazin::getNumarAngajati));
        magazinMap.forEach((key, values) -> System.out.println(key + " = " + values));

        List<String> magazinSet = Arrays.stream(magazine).map(Magazin::getNumeMagazin).distinct().collect(Collectors.toList());
        magazinSet.forEach(p -> System.out.print(p + " "));
        System.out.println();

        Set<String> magazinSe2t = Arrays.stream(magazine).map(Magazin::getNumeMagazin).collect(Collectors.toSet());
        System.out.println(magazinSe2t);
    }
}
