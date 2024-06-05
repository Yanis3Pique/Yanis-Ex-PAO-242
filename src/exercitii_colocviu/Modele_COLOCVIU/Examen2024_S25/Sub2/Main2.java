package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<TenisATP> tenisATPList = new ArrayList<>();
        tenisATPList.add(new TenisATP("Yanis", "Romana", 1, 400, 10));
        tenisATPList.add(new TenisATP("Catalin", "Romana", 2, 2000, 13));
        tenisATPList.add(new TenisATP("Vlad", "Spaniola", 3, 1300, 9));
        tenisATPList.add(new TenisATP("Mina", "Spaniola", 4, 5300, 4));

        // Jucatori de tenis cu cel putin 10 turnee, sortati alfabetic dupa nume
        tenisATPList.stream().filter(p -> p.getNrTurneeATP() >= 10).sorted((p1, p2) -> p1.getNumeJucator().compareTo(p2.getNumeJucator())).forEach(System.out::println);
        System.out.println();

        // Lista nationalitatilor distince ale jucatorilor
        tenisATPList.stream().map(TenisATP::getNationalitateJucator).distinct().forEach(System.out::println);
        System.out.println();

        // Creati o colectie cu jucatorii cu punctele intre 1000 si 4000
        List<TenisATP> listJucatoriPct = tenisATPList.stream().filter(p -> p.getPuncteATP() >= 1000 && p.getPuncteATP() <= 4000).toList();
        listJucatoriPct.forEach(System.out::println);
        System.out.println();

        // Afisati jucatorii grupati dupa nationalitate
        tenisATPList.stream().collect(Collectors.groupingBy(TenisATP::getNationalitateJucator)).forEach((a,b) -> System.out.println(b));
    }
}
