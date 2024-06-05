package exercitii_colocviu.Modele_COLOCVIU.Examen2018.Sub3;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        String[] fisiere = {"magazin_1.txt", "magazin_2.txt"};
        CalculateTotalValue calculateTotalValue = new CalculateTotalValue("Sapun", fisiere);
        Thread thread = new Thread(calculateTotalValue);
        thread.run();
        thread.join();
    }
}
