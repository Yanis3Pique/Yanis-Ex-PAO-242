package lab10.Ex2;

//2. Se defineste un array de primitive int
//sa se sorteze crescator
//Sa se sorteze descrescator -> se foloseste stream
//Lista cu elementele ar2 ridicate la patrat (map)

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        int array_of_integers[] = {26, 3, 10, 53, 7, 8, 12, 5, 1, 9, 4, 6, 2, 11, 13};
        Integer[] array_output = Arrays.stream(array_of_integers).boxed().toArray(Integer[]::new);

        // Sort array in ascending order
        System.out.println("Sort array in ascending order:");
        Arrays.sort(array_output, Comparator.naturalOrder());
        System.out.println(Arrays.toString(array_output));

        // Sort array in descending order
        System.out.println("Sort array in descending order:");
        System.out.println(Arrays.stream(array_output).sorted((a,b) -> b-a).collect(Collectors.toList()));

        // Square of array elements
        System.out.println("Square of array elements:");
        System.out.println(Arrays.stream(array_output).map(a -> a*a).collect(Collectors.toList()));
    }
}
