package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        CarteAnalyzer CLB = new CarteAnalyzer();
        String[] files = {"librarieCLB_1.txt", "librarieCLB_2.txt"};

        CLB.readCartiFromFiles(files);

        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduceti titlul cartii: ");
        String titlu = scanner.nextLine();
        System.out.print("Introduceti autorul cartii: ");
        String autor = scanner.nextLine();
        scanner.close();

        double stoc = CLB.calculeazaStocTotal(titlu, autor);
        System.out.println("Stocul pentru " + titlu + " de " + autor + " este " + stoc);
    }
}
