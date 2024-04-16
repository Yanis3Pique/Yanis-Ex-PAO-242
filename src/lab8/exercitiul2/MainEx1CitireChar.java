package lab8.exercitiul2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MainEx1CitireChar {
//    Sa se citeasca afiseze din fisierul persoaneChar.txt toate persoanele cu acelasi nume prenume
//
//    aici va fi citire pe char cu BufferedReader
//
//    Clasa principala se va numi MainEx1CitireChar.

    public static void main(String[] args) {
        writeData();
    }

    public static void writeData() {
        Map<String, Integer> nameCounts = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("persoaneChar.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 2) {
                    String fullName = parts[0] + " " + parts[1];
                    nameCounts.put(fullName, nameCounts.getOrDefault(fullName, 0) + 1);
                }
            }

            // Now, print names that appear more than once
            for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " apare de " + entry.getValue() + " ori");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found", e);
        } catch (IOException e) {
            throw new RuntimeException("IO Exception", e);
        }
    }
}
