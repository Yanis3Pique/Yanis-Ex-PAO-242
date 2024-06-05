package exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub3;

import exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub2.CalculeazaCuvinte;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] filenames = {"Bucharest.txt", "Warsaw.txt"};
        CalculeazaValoareTotalaVacante fir = new CalculeazaValoareTotalaVacante("Dubai", filenames);
        Thread thread = new Thread(fir);

        thread.start();
        thread.join();
    }
}
