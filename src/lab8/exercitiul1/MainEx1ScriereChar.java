package lab8.exercitiul1;

import java.io.*;
import java.util.Scanner;

public class MainEx1ScriereChar {
//    Cititi din streamul de intrare:
//    nume
//    prenume
//    varsta
//    suma
//    valuta
//
//    Daca suma > 2000 , se arunca exceptie custom si reia citirea de la capat (nu se iese din program).
//
//    Campurile de mai sus se vor scrie intr un fisier numit persoaneChar.txt utilizand separatorul ; intre campuri.
//    Pentru fiecare persoana se va scrie cate un rand.
//    Se va folosi scriere pe caractere, cu BufferedWriter.
//
//    Clasa principala se va numi MainEx1ScriereChar.

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            readData();
        }
    }

    public static void readData(){
        try (BufferedWriter fos = new BufferedWriter(new FileWriter("persoaneChar.txt", true))) {
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

            String persoana = nume + ";" + prenume + ";" + varsta + ";" + suma + ";" + valuta + "\n";
            fos.write(persoana);
        } catch (SumaPeste2000Exception e) {
            readData();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkSum(double suma) throws SumaPeste2000Exception {
        if(suma > 2000){
            System.out.println("Suma depaseste 2000");
            throw new SumaPeste2000Exception("Suma este > 2000");
        }
    }
}
