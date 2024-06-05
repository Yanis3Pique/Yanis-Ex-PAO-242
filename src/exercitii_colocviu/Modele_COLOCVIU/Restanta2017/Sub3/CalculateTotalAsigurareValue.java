package exercitii_colocviu.Modele_COLOCVIU.Restanta2017.Sub3;

import exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub3.CalculeazaValoareTotalaVacante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculateTotalAsigurareValue implements Runnable {
    String tip;
    String[] filenames;

    public CalculateTotalAsigurareValue(String tip, String[] filenames) {
        this.filenames = filenames;
        this.tip = tip;
    }

    @Override
    public void run() {
        double totalValue = 0;
        for(String file : filenames) {
            totalValue += calculeazaValoareTotalaTip(tip, file);
        }
        System.out.println("Valoarea totala a politelor de asigurare " + tip + " este " + totalValue + " RON");
    }

    private double calculeazaValoareTotalaTip(String tip, String file) {
        double totalValue = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if(parts[0].equals(tip)) {
                    totalValue += Double.parseDouble(parts[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalValue;
    }
}
