import java.util.Date;

public class BookItem extends Book {
    private String barcode;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookFormat bookFormat;
    private BookStatus bookStatus;
    private Date publicationDate;
    private Rack placedAt;

    public boolean checkout(String memberId) {
        if(this.isReferenceOnly) {
            System.out.println("This book is reference only and can't be issued");
            return false;
        }
        if(!BookLending.lendBook(barcode,memberId)) {
          return false;
        }
        this.bookStatus = BookStatus.LOANED;
        return true;
    }
}
