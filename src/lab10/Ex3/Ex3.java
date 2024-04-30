package lab10.Ex3;

//3. Se defineste o lista de obiecte Magazin
//Magazin are: numeMagazin, numarAngajati
//
//sa se afiseze magazinele grupate by numarAngajati
//sa se afiseze suma angajatilor din toate magazinele

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        Magazin[] magazine = new Magazin[8];
        magazine[0] = new Magazin("Magazin1", 10);
        magazine[1] = new Magazin("Magazin2", 10);
        magazine[2] = new Magazin("Magazin3", 30);
        magazine[3] = new Magazin("Magazin4", 40);
        magazine[4] = new Magazin("Magazin5", 50);
        magazine[5] = new Magazin("Magazin6", 50);
        magazine[6] = new Magazin("Magazin7", 50);
        magazine[7] = new Magazin("Magazin8", 100);

        // Display the stores grouped by number of employees
        System.out.println("Display the stores grouped by number of employees:");
        Map<Integer, List<Magazin>> grouped_by_numarAngajati = Arrays.stream(magazine).collect(Collectors.groupingBy(Magazin::getNumarAngajati));
        grouped_by_numarAngajati.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println();

        // Display the sum of employees from all stores
        System.out.println("Display the sum of employees from all stores:");
        Map<Integer, Integer> sum_of_employees_map = Arrays.stream(magazine).collect(Collectors.
                groupingBy(Magazin::getNumarAngajati, Collectors.summingInt(Magazin::getNumarAngajati)));
        System.out.println(sum_of_employees_map.values().stream().reduce(0, Integer::sum));
    }
}
