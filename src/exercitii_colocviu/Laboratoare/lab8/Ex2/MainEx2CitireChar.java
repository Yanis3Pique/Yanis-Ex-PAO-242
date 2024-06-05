package exercitii_colocviu.Laboratoare.lab8.Ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainEx2CitireChar {
    public static void main(String[] args) {
        try(BufferedReader fout = new BufferedReader(new FileReader("persoaneChar.txt"))) {
            String linie;
            while((linie = fout.readLine()) != null) {
                for(String cuvant : linie.split(";")) {
                    System.out.print(cuvant + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
