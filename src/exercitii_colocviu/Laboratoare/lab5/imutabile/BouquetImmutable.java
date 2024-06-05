package exercitii_colocviu.Laboratoare.lab5.imutabile;

public final class BouquetImmutable {
    private final int nmbOfFlowers;
    private final Flower flower;

    public BouquetImmutable(Flower flower, int nmbOfFlowers) {
        this.flower = new Flower(flower);
        this.nmbOfFlowers = nmbOfFlowers;

    }

    public int getNmbOfFlowers() {
        return nmbOfFlowers;
    }

    public Flower getFlower() {
        return new Flower(flower);
    }

    @Override
    public String toString() {
        return "BouquetImmutable{" +
                "flower=" + flower +
                ", nmbOfFlowers=" + nmbOfFlowers +
                '}';
    }
}
