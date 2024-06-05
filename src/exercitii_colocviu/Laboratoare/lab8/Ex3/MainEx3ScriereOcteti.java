package exercitii_colocviu.Laboratoare.lab8.Ex3;

import lab8.exercitiul1.SumaPeste2000Exception;

import java.util.Scanner;

public class MainEx3ScriereOcteti {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            readData();
        }
    }

    public static void readData(){
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Nume: ");
            String nume = s.nextLine();
            System.out.print("Prenume: ");
            String prenume = s.nextLine();
            System.out.print("Varsta: ");
            int varsta = s.nextInt();
            System.out.print("Suma: ");
            double suma = s.nextDouble();
            s.nextLine();
            System.out.print("Valuta: ");
            String valuta = s.nextLine();
            System.out.println();

            checkSum(suma);

            Persoana persoana = new Persoana(nume, prenume, varsta, suma, valuta);
            FileManagement.scriereObiectInFisier("persoaneOcteti.txt" ,persoana);
        } catch (SumaPeste2000Exception e) {
            readData();
        }
    }

    private static void checkSum(double suma) throws SumaPeste2000Exception {
        if(suma > 2000) {
            System.out.println("Suma depaseste 2000");
            throw new SumaPeste2000Exception("Suma > 2000");
        }
    }
}
