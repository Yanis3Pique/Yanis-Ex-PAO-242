package lab7;

public enum Currency {
    RON("Romania", "RO"),
    USD("Statele Unite ale Americii", "USA"),
    GBP("Marea Britanie", "GB"),
    TRY("Turcia", "TR"),
    EUR("Uniunea Europeana", "EU");

    private final String tara;
    private final String simbolTara;

    private Currency(String tara, String simbolTara) {
        this.tara = tara;
        this.simbolTara = simbolTara;
    }

    public String getTara() {
        return tara;
    }

    public String getSimbolTara() {
        return simbolTara;
    }
}
