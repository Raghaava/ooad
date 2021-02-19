import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookLending {
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarCode;
    private String memberId;

    private static Map<String,BookLending> db = new HashMap<>();

    private BookLending(String bookItemBarCode, String memberId) {
        this.bookItemBarCode = bookItemBarCode;
        this.memberId = memberId;
    }

    private void setDates() {
        Instant now = Instant.now();
        Instant after= now.plus(Duration.ofDays(7));
        this.creationDate = Date.from(now);
        this.dueDate = Date.from(after);
    }

    public static boolean lendBook(String bookItemBarCode, String memberId) {
        BookLending lending = new BookLending(bookItemBarCode, memberId);
        lending.setDates();
        db.put(bookItemBarCode, lending);

        return true;
    }

    public static BookLending fetchLendingDetail(String bookItemBarCode) {
        return db.get(bookItemBarCode);
    }

}
