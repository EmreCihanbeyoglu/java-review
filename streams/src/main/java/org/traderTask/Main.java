package org.traderTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

        System.out.println("Find all transactions in the year 2011 and sort them by value(small to high)");
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("What are all the unique cities where the traders work?");
        transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);


        System.out.println("Find all traders from Cambridge and sort them by name.");
        transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> trader.getCity() == "Cambridge")
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("Return a string of all traders’ names sorted alphabetically.");
        String concatenatedName = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .map(Trader::getName)
                .sorted()
                .reduce("", (a, b) -> a + "," + b);
        System.out.println(concatenatedName);

        System.out.println("Are any traders based in Milan?");
        boolean anyFromMilan = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(anyFromMilan);

        System.out.println("Print the values of all transactions from the traders living in Cambridge.");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("2nd - Print the values of all transactions from the traders living in Cambridge.");
        transactions.stream()
                .map(transaction -> new String[]{transaction.getTrader().getCity(), String.valueOf(transaction.getValue())})
                .filter(a -> a[0].equals("Cambridge"))
                .map(a -> a[1])
                .forEach(System.out::println);

        System.out.println("Find the transaction with the smallest value.");
        Optional optMin = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        optMin.ifPresent(System.out::println);
    }
}
