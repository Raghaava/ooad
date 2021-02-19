package fine;

import java.util.Date;

public abstract class FineTransaction {
    private Date creationDate;

    public FineTransaction(Date creationDate) {
        this.creationDate = creationDate;
    }

    public abstract boolean initiateTransaction(double amount);
}
