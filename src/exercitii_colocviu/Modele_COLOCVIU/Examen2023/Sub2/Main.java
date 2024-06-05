package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Carte> carti = new ArrayList<>();
        carti.add(new Carte("Autor1", "ABC", 5, 29.99, "Titlu1"));
        carti.add(new Carte("Autor1", "ABC", 10, 34.99, "Titlu2"));
        carti.add(new Carte("Autor2", "ABC", 15, 69.99, "Titlu3"));
        carti.add(new Carte("Autor3", "Editura2", 25, 44.99, "Titlu4"));
        carti.add(new Carte("Autor2", "Editura2", 30, 49.99, "Titlu5"));
        carti.add(new Carte("Autor5", "Editura3", 35, 54.99, "Titlu6"));
        carti.add(new Carte("Autor2", "Editura4", 40, 59.99, "Titlu7"));
        carti.add(new Carte("Autor3", "Editura5", 45, 64.99, "Titlu8"));
        carti.add(new Carte("Autor4", "Editura6", 50, 69.99, "Titlu9"));

        // Afisati cartile cu mai mult de 10 exemplare, in ordinea alfabetica a autorilor
        carti.stream().filter(p -> p.getNrExemplare() >= 10).sorted(Comparator.comparing(Carte::getAutor)).forEach(System.out::println);
        System.out.println();

        // Afisati editurile distincte
        carti.stream().map(p -> p.getEditura()).distinct().forEach(System.out::println);
        System.out.println();

        // Creati o colectie care sa contina cartile de la editura ABC cu pretul cuprins intre 50 - 100 RON
        List<Carte> carteList = carti.stream().filter(p -> p.getPret() > 50 && p.getPret() < 100 && p.getEditura().equals("ABC")).toList();
        carteList.forEach(System.out::println);
        System.out.println();

        // Afisati pentru fiecare autor lista cartilor publicate
        carti.stream().collect(Collectors.groupingBy(p -> p.getAutor())).entrySet().forEach(System.out::println);
//        carti.stream().collect(Collectors.groupingBy(p -> p.getAutor())).forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
