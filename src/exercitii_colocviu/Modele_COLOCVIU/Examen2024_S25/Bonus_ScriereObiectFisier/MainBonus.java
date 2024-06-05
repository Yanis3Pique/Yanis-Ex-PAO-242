package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Bonus_ScriereObiectFisier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MainBonus {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        List<TenisATP> lista1 = new ArrayList<>();
        lista1.add(new TenisATP("Novak Djokovic", "Serbia", 1, 12000, 85));
        lista1.add(new TenisATP("Rafael Nadal", "Spania", 2, 9500, 90));
        lista1.add(new TenisATP("Roger Federer", "Elveția", 3, 8000, 103));
        lista1.add(new TenisATP("Daniil Medvedev", "Rusia", 4, 7800, 70));
        lista1.add(new TenisATP("Dominic Thiem", "Austria", 5, 7200, 65));
        lista1.add(new TenisATP("Stefanos Tsitsipas", "Grecia", 6, 6800, 60));
        lista1.add(new TenisATP("Alexander Zverev", "Germania", 7, 6500, 55));
        lista1.add(new TenisATP("Andrey Rublev", "Rusia", 8, 6300, 50));
        lista1.add(new TenisATP("Matteo Berrettini", "Italia", 9, 6100, 45));
        lista1.add(new TenisATP("Diego Schwartzman", "Argentina", 10, 5900, 40));

        ScrieCitesteObiecteInFisier fir1 = new ScrieCitesteObiecteInFisier("jucatoriTenisATP_1.txt", lista1);
        Thread thread1 = new Thread(fir1);
        thread1.start();
        thread1.join();

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("jucatoriTenisATP_1.txt"))) {
            List<TenisATP> outputList = (List<TenisATP>) objectInputStream.readObject();
            for(TenisATP tenisATP : outputList) {
                System.out.println(tenisATP.getNumeJucator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
