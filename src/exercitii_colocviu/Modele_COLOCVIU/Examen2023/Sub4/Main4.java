package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub4;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Persoana> persoane = new ArrayList<>();
        persoane.add(new Persoana("Nume1", 25, 35000.0));
        persoane.add(new Persoana("Nume2", 30, 45000.0));
        persoane.add(new Persoana("Nume3", 22, 32000.0));
        persoane.add(new Persoana("Nume4", 28, 40000.0));
        persoane.add(new Persoana("Nume5", 35, 50000.0));
        persoane.add(new Persoana("Nume6", 40, 60000.0));
        persoane.add(new Persoana("Nume7", 45, 65000.0));
        persoane.add(new Persoana("Nume8", 50, 70000.0));
        persoane.add(new Persoana("Nume9", 55, 75000.0));
        persoane.add(new Persoana("Nume10", 60, 80000.0));

        CitireScrierePersoane citireScrierePersoane = CitireScrierePersoane.getInstance("persoane.csv", persoane);

        citireScrierePersoane.scriereFisierCSV();

        citireScrierePersoane.citireFisierCSV();
    }
}
