package exercitii_colocviu.Modele_COLOCVIU.Restanta2017.Sub2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Asigurare> asigurari = new ArrayList<>();
        asigurari.add(new Asigurare("RCA", "Ion Popescu", 5000, "Bucuresti"));
        asigurari.add(new Asigurare("CASCO", "Maria Ionescu", 30000, "Cluj"));
        asigurari.add(new Asigurare("RCA", "Vasile Gheorghe", 10000, "Bucuresti"));
        asigurari.add(new Asigurare("CASCO", "Ion Popescu", 25000, "Timisoara"));
        asigurari.add(new Asigurare("RCA", "Ion Popescu", 20000, "Bucuresti"));

        // Afisati asigurarile RCA in ordinea descrescatoare a valorilor lor
        asigurari.stream().filter(p -> p.getTip().equals("RCA")).sorted((p1, p2) -> Double.compare(p2.getValoare(), p1.getValoare())).forEach(System.out::println);
        System.out.println();

        // Afisati localitatile distincte in care societatea a incheiat asigurari
        asigurari.stream().map(p -> p.getLocalitate()).distinct().forEach(System.out::println);
        System.out.println();

        // Creati o colectie care sa contina asigurarile incheiate in Bucuresti cu valoarea intre 10000 si 50000
        List<Asigurare> asigurareList = asigurari.stream().filter(p -> p.getLocalitate().equals("Bucuresti") && p.getValoare() >= 10000 && p.getValoare() <= 50000).toList();
        System.out.println(asigurareList);
        System.out.println();

        // Afisati pentru fiecare persoana o lista a asigurarilor incheiate
        Map<String, List<Asigurare>> mapAsigurariPersoane = asigurari.stream().collect(Collectors.groupingBy(p -> p.getTitular()));
        for(Map.Entry<String, List<Asigurare>> listEntry : mapAsigurariPersoane.entrySet()) {
            System.out.println(listEntry.getKey() + " ---> " + listEntry.getValue());
        }
    }
}
