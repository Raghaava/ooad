package account;

import java.util.Date;

public class Member extends Account {
    private Date dateOfMembership;
    private int totalBooksCheckedout;

    public int getTotalBooksCheckedout() {return 0;};

    public boolean reserveBookItem(BookItem bookItem){return false;}

    private void incrementTotalBooksCheckedout() {};

    public boolean checkoutBookItem(BookItem bookItem) {
        return false;
    }
}
