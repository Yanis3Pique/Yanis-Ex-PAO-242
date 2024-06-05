package exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CalculeazaCuvinte implements Runnable {
    private String filename;
    private Integer n;
    private int nrCuvinte;

    public CalculeazaCuvinte(String filename, Integer n) {
        this.filename = filename;
        this.n = n;
    }

    @Override
    public void run() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String linie;
            while((linie = bufferedReader.readLine()) != null) {
                String[] parts = linie.split("[.;,!?' +=-]+");
                for(String cuvant : parts) {
                    if(cuvant.length() >= n) {
                        nrCuvinte++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public int getNrCuvinte() {
        return nrCuvinte;
    }

    public void setNrCuvinte(int nrCuvinte) {
        this.nrCuvinte = nrCuvinte;
    }
}
