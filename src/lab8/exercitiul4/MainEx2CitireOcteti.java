package lab8.exercitiul4;

import lab8.exercitiul3.FileManagement;
import lab8.exercitiul3.Persoana;

import java.util.Arrays;

public class MainEx2CitireOcteti {
//    Sa se citeasca si afiseze din fisierul persoaneOcteti.txt toate persoanele cu acelasi nume prenume
//
//    aici va fi citire cu stream pe obiect.
//
//
//    Clasa principala se va numi MainEx2CitireOcteti.

    public static void main(String[] args) {
//        Persoana[] persoane = (Persoana[]) FileManagement.citireObiectDinFisier("persoaneOcteti.txt");
        Arrays.stream(FileManagement.citireObiectDinFisier("persoaneOcteti.txt")).toList().forEach(p -> System.out.println(p));
    }
}
