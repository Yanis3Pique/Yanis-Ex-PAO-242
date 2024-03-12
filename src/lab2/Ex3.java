package lab2;

import java.util.Scanner;

public class Ex3 {
    public static void Nth_element_of_Fibonacci(int N) {
        int sAnteprecendent = 1, sPrecedent = 2;
        int sCurent = 0;
        int contor = 2;

        while(contor < N) {
            contor++;

            sCurent = sAnteprecendent + sPrecedent;
            sAnteprecendent = sPrecedent;
            sPrecedent = sCurent;
        }

        System.out.println(sCurent);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Nth_element_of_Fibonacci(N);
    }
}
