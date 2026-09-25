import java.util.Arrays;
import java.util.List;

public class task1_dataAggregation {

    static class Transaction {
        int transId;
        double amount;
        String status;

        public Transaction(int transId, double amount, String status) {
            this.transId = transId;
            this.amount = amount;
            this.status = status;
        }
    }

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(1, 50.00, "completed"),
            new Transaction(2, 120.50, "refunded"),
            new Transaction(3, 75.25, "completed"),
            new Transaction(4, 15.00, "pending")
        );

        double totalAmount = completedTransactions(transactions);

        System.out.println("Total amount of completed transactions is: RM" + totalAmount);
    }

    public static double completedTransactions(List<Transaction> transactions) {
        return transactions.stream()
            .filter(t -> "completed".equals(t.status))
            .mapToDouble(t -> t.amount)
            .sum();
    }
}