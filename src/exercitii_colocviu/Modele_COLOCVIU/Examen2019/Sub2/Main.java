package exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 1;
        CalculeazaCuvinte fir1 = new CalculeazaCuvinte("poezie_1.txt", n);
        CalculeazaCuvinte fir2 = new CalculeazaCuvinte("poezie_2.txt", n);
        Thread thread1 = new Thread(fir1);
        Thread thread2 = new Thread(fir2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Avem " + (fir1.getNrCuvinte() + fir2.getNrCuvinte()) + " cuvinte cu cel putin " + n + " litere in cele doua fisiere");
    }
}
