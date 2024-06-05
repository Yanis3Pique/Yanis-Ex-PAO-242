package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub4;

import java.io.*;
import java.util.ArrayList;

public class CitireScrierePersoane {
    private String file;
    private ArrayList<Persoana> persoane;
    private static CitireScrierePersoane instanta = null;

    private CitireScrierePersoane(String file, ArrayList<Persoana> persoane) {
        this.file = file;
        this.persoane = persoane;
    }

    public static CitireScrierePersoane getInstance(String file, ArrayList<Persoana> persoane) {
        if (instanta == null) {
            instanta = new CitireScrierePersoane(file, persoane);
        }
        return instanta;
    }

    public void scriereFisierCSV() throws FileNotFoundException {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            System.out.println("Am scris in fisier persoanele:");
            for(Persoana persoana : persoane) {
                String linie = persoana.getNume() + "," + persoana.getVarsta() + "," + persoana.getVenitAnual() + "\n";
                bufferedWriter.write(linie);
                System.out.print(persoana.getNume() + " ");
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void citireFisierCSV() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            System.out.println("Am citit din fisier persoanele:");
            String linie;
            while((linie = bufferedReader.readLine()) != null) {
                String parts[] = linie.split(",");
                Persoana persoana = new Persoana(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
                System.out.print(persoana.getNume()  + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
