package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Bonus_ScriereObiectFisier;

import java.io.*;
import java.util.List;

public class ScrieCitesteObiecteInFisier implements Runnable {
    String filename;
    List<TenisATP> playersList;

    public ScrieCitesteObiecteInFisier(String filename, List<TenisATP> playersList) {
        this.filename = filename;
        this.playersList = playersList;
    }

    @Override
    public void run() {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename, true))) {
            objectOutputStream.writeObject(playersList);
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

    public List<TenisATP> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<TenisATP> playersList) {
        this.playersList = playersList;
    }
}
