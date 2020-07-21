package udemy_sec8c_autoboxing.ChallengeTimsCode;


import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() { return name; }

    public ArrayList<Double> getTransactions() { return transactions; }
}
