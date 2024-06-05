package exercitii_colocviu.Laboratoare.lab10.Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        Integer[] numere = {10, 3, 7, 4, 9, 2, 11, 1, 5, 8, 6};
        System.out.println(Arrays.stream(numere).sorted(Comparator.naturalOrder()).toList());
        System.out.println(Arrays.stream(numere).sorted((p1, p2) -> p2 - p1).toList());
        System.out.println(Arrays.stream(numere).map(p -> p*p).toList());

        System.out.println();

        int[] array_input = {10, 3, 7, 4, 9, 2, 11, 1, 5, 8, 6};
        List<Integer> numere2 = Arrays.stream(array_input).boxed().collect(Collectors.toList());
        System.out.println(numere2.stream().sorted(Comparator.naturalOrder()).toList());
        System.out.println(numere2.stream().sorted((p1, p2) -> p2 - p1).toList());
        System.out.println(numere2.stream().map(p -> p*p).toList());
    }
}
