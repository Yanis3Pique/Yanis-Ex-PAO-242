package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub3;

import java.util.ArrayList;
import java.util.List;

public class CarteAnalyzer {
    List<Carte> carti = new ArrayList<>();

    public void readCartiFromFiles(String[] files) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for(String file : files) {
            CarteReaderThread carteReaderThread = new CarteReaderThread(carti, file);
            carteReaderThread.start();
            threads.add(carteReaderThread);
        }
        for(Thread thread : threads) {
            thread.join();
        }
    }

    public double calculeazaStocTotal(String titlu, String autor) {
        double suma = 0.0;
        for(Carte carte : carti) {
            if(carte.getTitlu().equals(titlu) && carte.getAutor().equals(autor)) {
                synchronized (carti) {
                    suma += carte.getNrExemplare() * carte.getPret();
                }
            }
        }
        return suma;
    }
}
