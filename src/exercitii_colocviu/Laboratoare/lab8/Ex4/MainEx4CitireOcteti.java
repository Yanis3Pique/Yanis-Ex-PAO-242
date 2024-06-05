package exercitii_colocviu.Laboratoare.lab8.Ex4;

import exercitii_colocviu.Laboratoare.lab8.Ex3.FileManagement;

import java.util.Arrays;

public class MainEx4CitireOcteti {
    public static void main(String[] args) {
        Arrays.stream(FileManagement.citireObiectDinFisier("persoaneOcteti.txt")).toList().forEach(System.out::println);
    }
}
