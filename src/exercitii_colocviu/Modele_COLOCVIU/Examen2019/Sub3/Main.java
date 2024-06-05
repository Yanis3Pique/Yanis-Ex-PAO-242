package exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DiplomaLicenta> diplome = new ArrayList<>();
        diplome.add(new DiplomaLicenta("A123", "Ion Popescu", 2005, "Facultatea de Informatica", "Informatica", 9.5f));
        diplome.add(new DiplomaLicenta("B456", "Maria Ionescu", 2010, "Facultatea de Informatica", "Matematica", 8.7f));
        diplome.add(new DiplomaLicenta("C789", "Vasile Gheorghe", 2001, "Facultatea de Informatica", "Informatica", 10.0f));
        diplome.add(new DiplomaLicenta("D012", "Ana Popa", 2018, "Facultatea de Informatica", "Informatica", 10.0f));
        diplome.add(new DiplomaLicenta("E345", "Andrei Iliescu", 2018, "Facultatea de Informatica", "Matematica", 9.8f));
        diplome.add(new DiplomaLicenta("F049", "Maria Ionescu", 2010, "Facultatea de Informatica", "Informatica", 9.75f));

        // Afisati diplomele dintre 2000 si 2010 descrescator dupa medii
        diplome.stream().filter(p -> p.getAn() >= 2000 && p.getAn() <= 2010).sorted((p1, p2) -> Double.compare(p2.getMedie(), p1.getMedie())).forEach(System.out::println);
        System.out.println();

        // Afisati specializarile distincte cu diplome la FMI in 2018
        diplome.stream().filter(p -> p.getAn() == 2018).map(p -> p.getSpecializare()).distinct().forEach(System.out::println);
        System.out.println();

        // Lista cu numele absolventilor cu media 10
        List<String> listAbsolventi10 = diplome.stream().filter(p -> p.getMedie() == 10.0).map(p -> p.getAbsolvent()).toList();
        listAbsolventi10.forEach(System.out::println);
        System.out.println();

        // Afisati nr diplomelor eliberate pt informatica
        System.out.println(diplome.stream().filter(p -> p.getSpecializare().equals("Informatica")).count());

        System.out.println(diplome.stream().map(DiplomaLicenta::getMedie).max(Double::compare).get());
    }
}
