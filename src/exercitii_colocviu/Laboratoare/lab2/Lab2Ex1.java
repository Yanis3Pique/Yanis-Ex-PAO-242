package exercitii_colocviu.Laboratoare.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.Math.sqrt;

public class Lab2Ex1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 99; i++) {
            if(i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for(int i = 3; i <= 99; i+=3) {
            System.out.print(i + " ");
        }
        System.out.println();

        List<Integer> numere = new ArrayList<>();
        for(int i = 1; i <= 99; i++) {
            numere.add(i);
        }
        for(Integer nr : numere) {
            if(nr % 3 == 0) {
                System.out.print(nr + " ");
            }
        }
        System.out.println();

        for(int i = 1; i <= 99; i++) {
            numere.add(i);
        }

        Predicate<Integer> conditie = p -> p % 3 == 0;
        Predicate<Integer> conditie2 = p -> p >= 50;
        Consumer<Integer> afisare = p -> System.out.print(p + " | ");
        Function<Integer, Integer> dubleaza = p -> 2*p;
        Function<Double, Integer> dubleazaDouble = p -> (int) (2*p);
        Function<Integer, Double> radical = p -> (Double) sqrt(p);
        for(Integer nr : numere) {
            if(conditie.and(conditie2).test(nr)) {
                afisare.accept(nr);
            }
        }
        System.out.print("\n\n\n");
        numere.sort((p1, p2) -> p2 - p1);
        for(int i = 0; i < numere.size(); i++) {
            if(conditie.and(conditie2).test(numere.get(i))) {
                afisare.accept(numere.get(i));
            }
        }
        System.out.print("\n\n\n");
        System.out.println(numere.get(71));
        System.out.println(dubleaza.apply(numere.get(24)));
        System.out.println(dubleaza.andThen(radical).apply(numere.get(71)));
        System.out.println(radical.compose(dubleaza).apply(numere.get(71)));
        System.out.println(dubleazaDouble.compose(radical).apply(numere.get(71)));
        System.out.println(radical.andThen(dubleazaDouble).apply(numere.get(71)));

        System.out.print("\n\n\n");
        numere.stream().filter(p -> p % 2 == 0 && p >= 30).sorted((p1, p2) -> p2 - p1).forEach(System.out::println);

        System.out.print("\n\n\n");
        System.out.println(numere.stream().filter(p -> p % 3 == 0).count());

        System.out.print("\n\n\n");
        System.out.println(numere.stream().filter(p -> p % 25 == 0).collect(Collectors.summingInt(p -> p)));

        System.out.print("\n\n\n");
        System.out.println((Integer) numere.stream().filter(p -> p % 25 == 0).mapToInt(p -> p*p).sum());

        System.out.print("\n\n\n");
        System.out.println(String.valueOf(numere.stream().filter(p -> p % 25 == 0).collect(Collectors.toCollection(ArrayList::new))));

        System.out.print("\n\n\n");
        System.out.print("Dati n=");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int nr = 1; nr <= n; nr++) {
            long anteprecedent = 0, precedent = 1, curent = 0;
            if(nr == 1) {
                System.out.println("Termenul 1: " + anteprecedent);
            }
            else if(nr == 2) {
                System.out.println("Termenul 2: " + precedent);
            }
            else {
                int contor = 3;
                while(contor <= nr) {
                    curent = anteprecedent + precedent;
                    anteprecedent = precedent;
                    precedent = curent;
                    contor++;
                }
                System.out.println("Termenul " + (contor-1) + ": " + curent);
            }
        }
    }
}
