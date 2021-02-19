package fine;

public class Fine {
    private final double amount;
    private FineTransaction fineTransaction;

    public Fine(double amount) {
        this.amount = amount;
    }

    public boolean collectFine(String memberId, long days) {
        return fineTransaction.initiateTransaction(amount * days);
    }

    public void setFineTransaction(FineTransaction fineTransaction) {
        this.fineTransaction = fineTransaction;
    }
}
