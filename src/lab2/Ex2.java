package lab2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();
        int nr3 = scanner.nextInt();

        if(nr1 < nr2) {
            if(nr2 < nr3) {
                System.out.println(nr1 + " < " + nr2 + " < " + nr3);
            } else if (nr2 > nr3) {
                System.out.println(nr1 + " < " + nr2 + " > " + nr3);
            }
        }
        else {
            if(nr2 < nr3) {
                System.out.println(nr1 + " > " + nr2 + " < " + nr3);
            } else if (nr2 > nr3) {
                System.out.println(nr1 + " > " + nr2 + " > " + nr3);
            }
        }
    }
}
