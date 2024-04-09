package lab7;

public class ConversieCurrencyImpl implements ConversieCalcul{
    @Override
    public double conversieValutaToEur(Currency currency, double suma) {
        return switch (currency) {
            case RON -> suma / 4.87;
            case USD -> suma / 1.18;
            case GBP -> suma / 0.86;
            case TRY -> suma / 10.33;
            case EUR -> suma;
            default -> 0;
        };
    }

    @Override
    public double calculRata() {
        return 0;
    }
}
