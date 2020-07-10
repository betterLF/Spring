package lesson06.book_xml.Service;

import java.util.List;

public interface Cashier {
    void checkOut(String uid, List<String> bids);
}
