package exercitii_colocviu.Laboratoare.lab8.Ex1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEx1ScriereChar {

    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            readData();
        }
    }

    public static void readData() {
        try (BufferedWriter fin = new BufferedWriter(new FileWriter("persoanechar.txt", true))) {
            Scanner in = new Scanner(System.in);
            System.out.print("Nume: ");
            String nume = in.nextLine();
            System.out.print("Prenume: ");
            String prenume = in.nextLine();
            System.out.print("Varsta: ");
            int varsta = in.nextInt();
            System.out.print("Suma: ");
            in.nextLine();
            double suma = in.nextDouble();
            System.out.print("Valuta: ");
            in.nextLine();
            String valuta = in.nextLine();

            verificaConditieSuma(suma);

            String stringDeScrisInFisier = nume + ";" + prenume + ";" + varsta + ";" + suma + ";" + valuta + "\n";
            fin.write(stringDeScrisInFisier);
        }
        catch (SumaEPeste2000Exception e) {
            readData();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void verificaConditieSuma(double suma) throws SumaEPeste2000Exception {
        if (suma > 2000) {
            System.out.println("Suma depaseste 2000");
            throw new SumaEPeste2000Exception("Suma > 2000");
        }
    }
}
