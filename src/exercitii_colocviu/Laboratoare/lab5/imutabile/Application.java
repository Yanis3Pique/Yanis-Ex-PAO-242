package exercitii_colocviu.Laboratoare.lab5.imutabile;

public class Application {
    public static void main(String[] args) {
        Flower floare = new Flower("alb", 9, "banut");
        Bouquet buchet = new Bouquet(floare, 11);
        BouquetImmutable buchetImutabil = new BouquetImmutable(floare, 11);

        System.out.println(buchet.toString());
        System.out.println();
        System.out.println(buchetImutabil.toString());
        System.out.println();

        floare.setName("lalea");
        floare.setColor("rosu");
        floare.setNmbPetals(4);

        System.out.println(buchet.toString());
        System.out.println();
        System.out.println(buchetImutabil.toString());
        System.out.println();
    }
}
