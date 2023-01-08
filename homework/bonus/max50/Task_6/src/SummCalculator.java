import java.util.HashMap;
public final class SummCalculator {
    public static int calculateSumm(HashMap<String, Integer> prices, HashMap<String, Integer> amounts) {
        int Summa = 0;
        for (var entry : amounts.entrySet() )
            Summa += entry.getValue() * prices.get(entry.getKey() );
        return Summa;
    }
}