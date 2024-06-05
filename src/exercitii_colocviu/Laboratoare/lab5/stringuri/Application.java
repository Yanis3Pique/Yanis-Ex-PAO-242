package exercitii_colocviu.Laboratoare.lab5.stringuri;

public class Application {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));
        System.out.println("x".matches("[^abc]"));
        System.out.println("f".matches("[a-z]"));
        System.out.println("m".matches("[a-zA-Z]"));
        System.out.println("gO".matches("[a-z][A-Z]"));
        System.out.println("a".matches("[abc]+"));
        System.out.println("".matches("[abc]*"));
        System.out.println("abcab".matches("[abc]{5}"));
        System.out.println("abcaaaabbcabbcaacacba".matches("[abc]{5,}"));
        System.out.println("aaabcaccb".matches("[abc]{5,10}"));

        String propozitie = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        System.out.println("Lungimea stringului = " + propozitie.length());
        if(propozitie.replace(".", "").replace(" ", "").matches("[a-zA-Z]*")) {
            System.out.println("Stringul are doar litere mari si litere mici");
        } else {
            System.out.println("Stringul NU are doar litere mari si litere mici");
        }

        String[] propozitie_impartita = propozitie.split(" ");
        if(propozitie_impartita.length % 2 == 0) {
            int mij = propozitie_impartita.length / 2;
            System.out.println(propozitie_impartita[mij - 1] + " " + propozitie_impartita[mij]);
        } else {
            int mij = propozitie_impartita.length / 2;
            System.out.println(propozitie_impartita[mij]);
        }

        StringBuilder sir_reversed = new StringBuilder();
        sir_reversed.append(propozitie);
        sir_reversed.reverse();
        System.out.println(sir_reversed);
    }
}
