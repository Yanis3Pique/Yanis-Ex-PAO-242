package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarteReaderThread extends Thread {
    String filename;
    List<Carte> carti = new ArrayList<>();

    public CarteReaderThread(List<Carte> carti, String filename) {
        this.carti = carti;
        this.filename = filename;
    }

    @Override
    public void run() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if(parts.length == 5) {
                    synchronized (carti) {
                        carti.add(new Carte(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), Double.parseDouble(parts[4])));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
