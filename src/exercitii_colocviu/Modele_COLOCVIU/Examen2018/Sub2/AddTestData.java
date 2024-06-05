package exercitii_colocviu.Modele_COLOCVIU.Examen2018.Sub2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AddTestData {
    public static void main(String[] args) {
        List<Produs> produse = new ArrayList<>();
        produse.add(new Produs("MegaJava", "Produs1", 10, 50));
        produse.add(new Produs("Firma2", "Produs1", 20, 70));
        produse.add(new Produs("MegaJava", "Produs1", 30, 200));
        produse.add(new Produs("Firma4", "Produs2", 40, 30));
        produse.add(new Produs("MegaJava", "Produs3", 50, 5));

        serializeProduse(produse, "produse.bin");
    }

    private static void serializeProduse(List<Produs> produse, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(produse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
