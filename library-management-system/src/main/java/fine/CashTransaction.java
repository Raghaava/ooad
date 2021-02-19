package fine;

import java.util.Date;

public class CashTransaction extends FineTransaction {
    private double cashTendered;

    public CashTransaction(Date creationDate, double cashTendered) {
        super(creationDate);
        this.cashTendered = cashTendered;
    }

    public double getCashTendered() {
        return cashTendered;
    }

    @Override
    public boolean initiateTransaction(double amount) {
        return true;
    }
}
