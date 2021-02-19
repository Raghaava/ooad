import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookReservation {
    private Date creationDate;
    private ReservationStatus status;
    private String bookItemBarcode;
    private String memberId;

    private static Map<String,BookReservation> db = new HashMap<>();

    private BookReservation(String bookItemBarcode,String memberId) {
        this.bookItemBarcode = bookItemBarcode;
        this.memberId = memberId;
        this.status = ReservationStatus.WAITING;
        this.creationDate = new Date();
    }

    public static boolean createBookReservation(String barcode,String memberId) {
        BookReservation bookReservation = new BookReservation(barcode,memberId);
        db.put(barcode,bookReservation);

        return true;
    }

    public static boolean cancelBookReservation(String barcode) {
        BookReservation bookReservation = db.get(barcode);
        if(bookReservation == null || bookReservation.status == ReservationStatus.CANCELED) {
            System.out.println("Book Reservation is not available or is already cancelled");
            return false;
        }

        bookReservation.status = ReservationStatus.CANCELED;

        return true;
    }

    public static BookReservation fetchReservationDetails(String barcode) {
        return db.get(barcode);
    }
}
