package exercitii_colocviu.Modele_COLOCVIU.Examen2018.Sub2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) throws IOException {
        List<Produs> listaProduse = new ArrayList<>();
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("produse.bin"))){
            listaProduse = (List<Produs>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Produsele firmei MegaJava, in ordinea crescatoare a preturilor unitare
        listaProduse.stream().filter(p -> p.getFirma().equals("MegaJava")).sorted((p1, p2) -> (int) (p2.getPretUnitar() - p1.getPretUnitar())).forEach(System.out::println);

        // Afisati o lista care contine denumirile distincte ale produselor
        System.out.println(listaProduse.stream().map(p -> p.getProdus()).distinct().toList());

        // Creati o colectie care sa contina produsele avand valoarea totala cel putin 1000
        List<Produs> produseValoarePeste1000 = listaProduse.stream().filter(p -> p.getCantitate() * p.getPretUnitar() >= 1000).toList();
        // List<String> produseValoarePeste1000 = listaProduse.stream().filter(p -> p.getCantitate() * p.getPretUnitar() >= 1000).map(p -> p.getProdus()).toList();
        // List<String> produseValoarePeste1000 = listaProduse.stream().filter(p -> p.getCantitate() * p.getPretUnitar() >= 1000).map(p -> p.getProdus()).distinct().toList();
        System.out.println(produseValoarePeste1000);

        // Afisati pentru fiecare firma produsele sale aflate in magazin
        Map<String, List<Produs>> produseGrupateDupaMagazin = listaProduse.stream().collect(Collectors.groupingBy(p -> p.getFirma()));
        System.out.println(produseGrupateDupaMagazin);
    }
}