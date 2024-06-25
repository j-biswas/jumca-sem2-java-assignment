package mylibrary;
import java.util.ArrayList;
import java.util.List;
public class TransactionList extends Transaction {
    List<Transaction> transactions;
    
    public TransactionList() {
        transactions = new ArrayList<Transaction>();
    }


    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void removeTransaction(Transaction transaction) {
        transactions.remove(transaction);
    }
}
