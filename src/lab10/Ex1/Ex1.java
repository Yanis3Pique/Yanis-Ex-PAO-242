package lab10.Ex1;

//1.Sa se defineasca un array de Integers.
//Sa se sorteze descrescator folosind lambda expression
//Sa se calculeze suma intregilor folosind reduce
//Sa se calculeze suma intregilor folosind summingInt
//Sa se calculeze media folosind lambda averagingInt
//Sa se afiseze min folosind lambda.
//Sa se afiseze max folosind lambda
//Sa se afiseze intregii mai mari de o anumita valoare folosind filter

import java.util.Arrays;
import java.util.Comparator;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class Ex1 {
    public static void main(String[] args) {
        Integer array_of_integers[] = {26, 3, 10, 53, 7, 8, 12, 5, 1, 9, 4, 6, 2, 11, 13};

        // Sort array in descending order
        System.out.println("Sort array in descending order:");
        Arrays.sort(array_of_integers, (a,b) -> b-a);
        System.out.println(Arrays.toString(array_of_integers));

        // Calculate sum of array elements using reduce
        System.out.println("Calculate sum of array elements using reduce:");
        int sum_of_array_reduce = Arrays.stream(array_of_integers).reduce(0, Integer::sum);
        System.out.println(sum_of_array_reduce);

        // Calculate sum of array elements using summingInt
        System.out.println("Calculate sum of array elements using summingInt:");
        int sum_of_array_summingInt = Arrays.stream(array_of_integers).collect(summingInt(Integer::intValue));
        System.out.println(sum_of_array_summingInt);

        // Calculate average of array elements using averagingInt
        System.out.println("Calculate average of array elements using averagingInt:");
        double average_of_array_averagingInt = Arrays.stream(array_of_integers).collect(averagingInt(Integer::intValue));
        System.out.println(average_of_array_averagingInt);

        // Maximum element in array
        System.out.println("Maximum element in array:");
        int max_element_of_array = Arrays.stream(array_of_integers).max((a,b) -> a-b).get();
        System.out.println(max_element_of_array);

        // Minimum element in array
        System.out.println("Minimum element in array:");
        int min_element_of_array = Arrays.stream(array_of_integers).min((a,b) -> a-b).get();
        System.out.println(min_element_of_array);

        // Filter elements greater than a certain value
        System.out.println("Filter elements greater than a certain value:");
        Integer[] filtered_array_greater_than_certain_value = Arrays.stream(array_of_integers).filter(a -> a > 12).
                sorted(Comparator.comparing(Integer::intValue)).toArray(Integer[]::new);
        System.out.println(Arrays.toString(filtered_array_greater_than_certain_value));
    }
}
