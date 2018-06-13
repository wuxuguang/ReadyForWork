package java8.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamTest {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        List<Transaction> transaction2s = null;

        System.out.println(transaction2s.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted((c1, c2) -> (c1.getValue() - c2.getValue()))
                .collect(toList()));

        System.out.println(transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted((c1, c2) -> (c1.getValue() - c2.getValue()))
                .collect(toList()));

        System.out.println(transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(Trader::getCity)
                .distinct().collect(toList()));
        System.out.println(
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName)).collect(toList())
        );

        System.out.println(
                transactions.stream()
                        .map(Transaction::getTrader)
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName))
                        .collect(toList())
        );

        System.out.println(
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(t -> t.getCity().equals("Milan"))
                        .distinct()
                        .collect(toList())
        );

        System.out.println(
                transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue).sum()
        );

        System.out.println(transactions.stream().map(Transaction::getValue).reduce(Integer::max));
    }
}
