package account;

import java.util.Date;

public class LibraryCard {
    private String cardNumber;
    private String barcode;
    private Date issuedAt;
    private boolean active;

    public boolean isActive() {
        return active;
    }
}
