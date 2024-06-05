package exercitii_colocviu.Laboratoare.lab5.imutabile;

public class Bouquet {
    private int nmbOfFlowers;
    private Flower flower;

    public Bouquet(Flower flower, int nmbOfFlowers) {
        this.flower = flower;
        this.nmbOfFlowers = nmbOfFlowers;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public int getNmbOfFlowers() {
        return nmbOfFlowers;
    }

    public void setNmbOfFlowers(int nmbOfFlowers) {
        this.nmbOfFlowers = nmbOfFlowers;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flower=" + flower +
                ", nmbOfFlowers=" + nmbOfFlowers +
                '}';
    }
}
