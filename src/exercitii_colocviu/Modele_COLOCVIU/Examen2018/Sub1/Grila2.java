package exercitii_colocviu.Modele_COLOCVIU.Examen2018.Sub1;

class Calcul_1 {
    void calcul(int a, int b) {
        System.out.print(a + b + " ");
    }
}

class Calcul_2 extends Calcul_1 {
    void calcul(int a, int b) {
        System.out.print(a - b + " ");
    }
}

class Calcul_3 extends Calcul_2 {
    void calcul(int a, int b) {
        System.out.print(a * b + " ");
    }
}

public class Grila2 {
    public static void main(String[] args) {
        Calcul_1 x = new Calcul_3();
        x.calcul(1, 2);

        Calcul_2 y = (Calcul_2) x;
        y.calcul(3, 4);

        Calcul_3 z = (Calcul_3) y;
        z.calcul(5, 6);
    }
}

