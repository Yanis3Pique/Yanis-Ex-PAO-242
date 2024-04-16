package lab8.exercitiul2;

import java.io.*;

public class MainEx1CitireChar {
//    Sa se citeasca afiseze din fisierul persoaneChar.txt toate persoanele cu acelasi nume prenume
//
//    aici va fi citire pe char cu BufferedReader
//
//    Clasa principala se va numi MainEx1CitireChar.

    public static void main(String[] args) {
        writeData();
    }

    public static void writeData(){
        try (BufferedReader fos = new BufferedReader(new FileReader("persoaneChar.txt"))) {
            String line;
            while((line = fos.readLine()) != null){
                if (line.split(";")[0].equals(line.split(";")[1])){
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
