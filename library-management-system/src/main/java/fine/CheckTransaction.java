package fine;

import java.util.Date;

public class CheckTransaction extends FineTransaction {
    private String bankName;
    private String checkNumber;

    public CheckTransaction(Date creationDate, String bankName, String checkNumber) {
        super(creationDate);
        this.bankName = bankName;
        this.checkNumber = checkNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public boolean initiateTransaction(double amount) {
        return true;
    }
}
