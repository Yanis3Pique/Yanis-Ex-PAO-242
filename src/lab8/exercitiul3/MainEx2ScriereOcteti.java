package lab8.exercitiul3;

import lab8.exercitiul1.SumaPeste2000Exception;

import java.util.Arrays;
import java.util.Scanner;

public class MainEx2ScriereOcteti {
//    Cititi din streamul de intrare:
//    nume
//    prenume
//    varsta
//    suma
//    valuta
//
//    Daca suma > 2000 , se arunca exceptie custom si reia citirea de la capat (nu se iese din program).
//
//    Campurile de mai sus se vor scrie intr un fisier numit persoaneOcteti.txt.
//    Se va folosi scriere pe octeti (cu stream) si mapare in obiect (vezi serialization).
//
//    Clasa principala se va numi MainEx2ScriereOcteti.

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            readData();
        }
    }

    public static void readData(){
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Nume: ");
            String nume = s.nextLine();
            System.out.println("Prenume: ");
            String prenume = s.nextLine();
            System.out.println("Varsta: ");
            int varsta = s.nextInt();
            System.out.println("Suma: ");
            double suma = s.nextDouble();
            System.out.println("Valuta: ");
            s.nextLine();
            String valuta = s.nextLine();

            checkSum(suma);

            Persoana persoanaCurenta = new Persoana(nume, prenume, varsta, suma, valuta);
            FileManagement.scriereObiectInFisier("persoaneOcteti.txt", persoanaCurenta);
        } catch (SumaPeste2000Exception e) {
            readData();
        }
    }

    private static void checkSum(double suma) throws SumaPeste2000Exception {
        if(suma > 2000){
            System.out.println("Suma depaseste 2000");
            throw new SumaPeste2000Exception("Suma este > 2000");
        }
    }

    private static void serializarePersoane(Persoana persoanaCurenta) {
        String fisierPersoane = "persoaneOcteti.txt";

        FileManagement.scriereObiectInFisier(fisierPersoane, persoanaCurenta);

        Arrays.stream(FileManagement.citireObiectDinFisier(fisierPersoane)).toList().forEach(p -> System.out.println(p));
    }
}
