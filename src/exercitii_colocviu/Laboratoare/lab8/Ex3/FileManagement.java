package exercitii_colocviu.Laboratoare.lab8.Ex3;

import java.io.*;

public class FileManagement {
    public static void scriereObiectInFisier(String fisier, Object... obj) {
        try(FileOutputStream fout = new FileOutputStream(fisier, true)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
            objectOutputStream.writeObject(obj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object[] citireObiectDinFisier(String fisier) {
        Object[] listaObiecte;
        try(FileInputStream fin = new FileInputStream(fisier)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fin);
            listaObiecte = (Object[]) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listaObiecte;
    }
}
