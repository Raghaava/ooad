package account;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;
    private LibraryCard card;

    public boolean resetPassword() {
        return true;
    }
}
