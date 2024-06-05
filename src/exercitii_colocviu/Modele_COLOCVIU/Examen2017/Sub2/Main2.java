package exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub2;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Log l1 = new Log("01.01.2016", "Messi", 2000, 7000);
        Log l2 = new Log("01.01.2017", "Suarez", 6000, 6500);
        Log l3 = new Log("01.01.2017", "Pique", 52000, 57000);
        Log l4 = new Log("01.02.2018", "Messi", 2100, 7100);
        Log l5 = new Log("01.03.2019", "Suarez", 6300, 6800);
        Log l6 = new Log("01.01.2017", "Bravo", 9000, 9500);
        Log l7 = new Log("01.04.2020", "Pique", 54000, 59000);
        Log l8 = new Log("01.05.2021", "Messi", 2200, 7200);
        Log l9 = new Log("01.06.2022", "Suarez", 6400, 6900);
        Log l10 = new Log("01.07.2023", "Pique", 55000, 60000);

        List<Log> logs = new ArrayList<>(List.of(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10));


        // Afisati utilizatorii care au fost conectati la server cel putin o ora(60*60 = 3600 de secunde)
        logs.stream().filter(p -> p.getLogout_time() - p.getLogin_time() >= 3600).map(p -> p.getUser()).distinct().forEach(System.out::println);
        System.out.println();

        // Afisati datele distincte in care s-a conectat cel putin un utilizator
        logs.stream().map(p -> p.getDate()).distinct().forEach(System.out::println);
        System.out.println();

        // Creati o colectie care sa contina utilizatorii care s-au conectat la server in ziua de 01.01.2017 pana la ora 12:00, in ordine alfbetica
        List<Log> list = logs.stream().filter(p -> p.getDate().equals("01.01.2017") && p.getLogout_time() <= 3600*12).sorted((p1, p2) -> p1.getUser().compareTo(p2.getUser())).toList();
        list.forEach(System.out::println);
        System.out.println();

        // Afisati pentru fiecare utilizator zilele in care s-a conectat la server
        logs.stream().collect(Collectors.groupingBy(p -> p.getUser(), Collectors.counting())).entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println(logs.stream().collect(Collectors.groupingBy(p -> p.getUser(), Collectors.counting())).values().stream().collect(Collectors.averagingDouble(p -> p)));
    }
}
