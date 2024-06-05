package exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub1;

import java.io.*;

class Persoana implements Serializable {
    String nume;
    int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        System.out.println("Constructor");
    }
}

public class Grila4 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("persoana.ser"));
        Persoana p = new Persoana("Popescu Ion", 40);
        oos.writeObject(p);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("persoana.ser"));
        Persoana r = (Persoana) ois.readObject();
        ois.close();
    }
}
