package exercitii_colocviu.Modele_COLOCVIU.Restanta2017.Sub3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] fisiere = {"sucursalaSafeLife_1.txt", "sucursalaSafeLife_2.txt"};
        CalculateTotalAsigurareValue fir = new CalculateTotalAsigurareValue("RCA", fisiere);
        Thread thread = new Thread(fir);

        thread.start();
        thread.join();
    }
}
