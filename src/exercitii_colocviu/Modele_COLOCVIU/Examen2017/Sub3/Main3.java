package exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub3;

import exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub2.Log;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        String[] fisiere = {"server_1.log", "server_2.log"};

        logAnalyzer.readLogsFromFiles(fisiere);

        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduceti numele utilizatorului: ");
        String user = scanner.nextLine();
        System.out.print("Introduceti data (zz.ll.aa): ");
        String date = scanner.nextLine();
        scanner.close();

        int nrLoguri = logAnalyzer.getUsersNumberOfLogs(user, date);

        System.out.println(user + " s-a conectat pe data de " + date + " de " + nrLoguri + " ori.");
    }
}
