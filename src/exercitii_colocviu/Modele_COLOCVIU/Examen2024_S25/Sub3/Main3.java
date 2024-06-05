package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub3;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class CalculeazaNrJucatoriNationalitateX implements Runnable {
    private String fileName;
    private String nationalitate;
    private int nrJucatori;

    public CalculeazaNrJucatoriNationalitateX(String fileName, String nationalitate) {
        this.fileName = fileName;
        this.nationalitate = nationalitate;
    }

    @Override
    public void run() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String linie;
            while((linie = bufferedReader.readLine()) != null) {
                String[] parts = linie.split(",");
                if(parts[1].equals(nationalitate)) {
                    nrJucatori++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getNationalitate() {
        return nationalitate;
    }

    public void setNationalitate(String nationalitate) {
        this.nationalitate = nationalitate;
    }

    public int getNrJucatori() {
        return nrJucatori;
    }

    public void setNrJucatori(int nrJucatori) {
        this.nrJucatori = nrJucatori;
    }
}


public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String nationalitate = scanner.nextLine();
        CalculeazaNrJucatoriNationalitateX fir1 = new CalculeazaNrJucatoriNationalitateX("jucatori_1.txt", nationalitate);
        CalculeazaNrJucatoriNationalitateX fir2 = new CalculeazaNrJucatoriNationalitateX("jucatori_2.txt", nationalitate);
        Thread thread1 = new Thread(fir1);
        Thread thread2 = new Thread(fir2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Avem " + (fir1.getNrJucatori() + fir2.getNrJucatori()) + " jucatori cu nationalitatea " + nationalitate);
    }
}
