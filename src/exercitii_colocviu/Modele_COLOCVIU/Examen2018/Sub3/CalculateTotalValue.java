package exercitii_colocviu.Modele_COLOCVIU.Examen2018.Sub3;

import java.io.*;

public class CalculateTotalValue implements Runnable {
    String numeProdus;
    String[] filenames;

    public CalculateTotalValue(String numeProdus, String[] filenames) {
        this.numeProdus = numeProdus;
        this.filenames = filenames;
    }

    @Override
    public void run() {
        float valoareTotala = 0;
        for(String fisier : filenames) {
            valoareTotala += calculeazaValoareTotalaPentruProdusDinFisier(numeProdus, fisier);
        }
        System.out.println("Valoarea produsului " + numeProdus + " din cele doua fisiere este " + valoareTotala);
    }

    private float calculeazaValoareTotalaPentruProdusDinFisier(String numeProdus, String fisier) {
        float valoareTotala = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fisier))) {
            String linie;
            while((linie = bufferedReader.readLine()) != null) {
                String[] parts = linie.split(",");
                if(parts[1].equals(numeProdus)) {
                    valoareTotala += Float.parseFloat(parts[2]) * Float.parseFloat(parts[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return valoareTotala;
    }
}
