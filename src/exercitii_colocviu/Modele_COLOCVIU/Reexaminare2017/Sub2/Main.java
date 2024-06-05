package exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Vacanta> vacante = new ArrayList<>();
        vacante.add(new Vacanta("Dubai", 2, 10000.0, "12/07/2023-26/07/2023"));
        vacante.add(new Vacanta("Paris", 2, 1500.0, "01/09/2023-10/09/2023"));
        vacante.add(new Vacanta("Dubai", 4, 3000.0, "15/09/2023-25/09/2023"));
        vacante.add(new Vacanta("Rome", 2, 1200.0, "10/10/2023-20/10/2023"));
        vacante.add(new Vacanta("Dubai", 2, 2500.0, "05/09/2023-15/09/2023"));
        vacante.add(new Vacanta("London", 3, 2000.0, "20/09/2023-30/09/2023"));

        // Afisati vacantele pentru doua persoane, descrescator dupa valoare
        vacante.stream().filter(p -> p.getNr_persoane() == 2).sorted((p1, p2) -> Double.compare(p2.getValoare(), p1.getValoare())).forEach(System.out::println);
        System.out.println();

        // Afisati destinatiile distincte ale vacantelor
        vacante.stream().map(p -> p.getDestinatie()).distinct().forEach(System.out::println);
        System.out.println();

        // Creati o colectie care sa contina vacantele din luna septembire a anului curent cu destinatia Dubai
        List<Vacanta> septembrie2023Dubai = vacante.stream().filter(p -> p.getDestinatie().equals("Dubai") && p.getPerioada().contains("09/2023")).toList();
        System.out.println(septembrie2023Dubai);
        System.out.println();

        // Afisati pentru fiecare destinatie o lista a vacantelor oferite de agentie
        Map<String, List<Vacanta>> mapDestinatii = vacante.stream().collect(Collectors.groupingBy(p -> p.getDestinatie()));
        for(Map.Entry<String, List<Vacanta>> entry : mapDestinatii.entrySet()) {
            System.out.println(entry);
        }
    }
}
