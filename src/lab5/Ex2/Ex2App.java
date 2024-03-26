package lab5.Ex2;

public class Ex2App {
    public static void main(String[] args) {
        //1)
        String sir = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        System.out.println("Lungimea sirului = " + sir.length());

        //2)
        System.out.println("Contine sirul doar litere mici si/sau mari?   --->   " + sir.matches("[a-zA-Z]+"));


        //3)
        String[] sir_impartit = sir.split(" ");
        int lungime = sir_impartit.length;
        if(lungime % 2 == 0) {
            System.out.println("Cuvintele din mijloc sunt: " + sir_impartit[lungime/2 - 1] + " " + sir_impartit[lungime/2]);
        }
        else {
            System.out.println("Cuvantul din mijloc este: " + sir_impartit[lungime/2]);
        }

        //4)
        StringBuilder sir_reversed = new StringBuilder();
        sir_reversed.append(sir);
        sir_reversed.reverse();
        System.out.println("Sirul inversat este: " + sir_reversed);
    }
}
