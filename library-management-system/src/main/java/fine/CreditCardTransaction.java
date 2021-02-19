package fine;

import java.util.Date;

public class CreditCardTransaction extends FineTransaction {
    private String nameOnTheCard;

    public CreditCardTransaction(Date creationDate, String nameOnTheCard) {
        super(creationDate);
        this.nameOnTheCard = nameOnTheCard;
    }

    @Override
    public boolean initiateTransaction(double amount) {
        return true;
    }
}
