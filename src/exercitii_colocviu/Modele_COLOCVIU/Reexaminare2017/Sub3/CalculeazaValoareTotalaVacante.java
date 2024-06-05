package exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculeazaValoareTotalaVacante implements Runnable {
    String[] filenames;
    String destinatie;

    public CalculeazaValoareTotalaVacante(String destinatie, String[] filenames) {
        this.destinatie = destinatie;
        this.filenames = filenames;
    }

    @Override
    public void run() {
        double valoareTotalaDestinatie = 0;
        for(String file : filenames) {
            valoareTotalaDestinatie += calculeazaValoareInFctDeDestinatieDintrunFisierAnume(file, destinatie);
        }
        System.out.println("Valoarea totala a vacantelor catre " + destinatie + " este " + valoareTotalaDestinatie);
    }

    private double calculeazaValoareInFctDeDestinatieDintrunFisierAnume(String file, String destinatie) {
        double valoareTotalaDestinatie = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] parts;
                parts = line.split(",");
                if(parts[0].equals(destinatie)) {
                    valoareTotalaDestinatie += Double.parseDouble(parts[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return valoareTotalaDestinatie;
    }
}
