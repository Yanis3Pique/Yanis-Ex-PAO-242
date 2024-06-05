package exercitii_colocviu.Laboratoare.lab10.Ex1;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] numere = {10, 3, 7, 4, 9, 2, 11, 1, 5, 8, 6};
        Arrays.sort(numere, (p1, p2) -> p2 - p1);
        for(Integer element : numere) {
            System.out.print(element + " ");
        }
        System.out.println();
//        List<Integer> numere2 = new ArrayList<>(List.of(10, 3, 7, 4, 9, 2, 11, 1, 5, 8, 6));
//        numere2.sort((p1, p2) -> p2 - p1);
//        for(Integer element : numere2) {
//            System.out.print(element + " ");
//        }

        System.out.println("Suma numerelor folosind reduce este " + Arrays.stream(numere).reduce(0, Integer::sum));

        System.out.println("Suma numerelor folosind summingInt este " + Arrays.stream(numere).collect(summingInt(Integer::intValue)));

        System.out.println("Media numerelor folosing averagingInt este " + Arrays.stream(numere).collect(averagingInt(Integer::intValue)));

        System.out.println("Minimul numerelor folosind lambda este " + Arrays.stream(numere).max((p1, p2) -> p1 - p2).get());

        System.out.println("Maximul numerelor folosind lambda este " + Arrays.stream(numere).min(Integer::compareTo).get());

        System.out.println();
        System.out.print("Dati un nr n: ");
        int n = new Scanner(System.in).nextInt();
        Arrays.stream(numere).filter(p -> p > n).forEach(System.out::println);
    }
}
