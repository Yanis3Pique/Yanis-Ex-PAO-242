package exercitii_colocviu.Modele_COLOCVIU.Examen2018.Sub1;

class Sir {
    private String sir;

    public Sir(String sir) {
        this.sir = sir;
    }

    public void modificaSir(String sir) {
        this.sir = sir;
    }

    public void modificaSir(Sir sir) {
        sir = new Sir("Mihai");
    }

    public String getSir() {
        return sir;
    }
}

public class Grila1 {
    public static void main(String[] args) {
        Sir s = new Sir("Ion");
        Sir t = new Sir("Alex");
        s.modificaSir("Matei");
        t.modificaSir(new Sir("Dan"));
        s.modificaSir(t);
        System.out.println(s.getSir() + " " + t.getSir());
    }
}
