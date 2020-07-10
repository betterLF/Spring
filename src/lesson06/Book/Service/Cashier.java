package lesson06.Book.Service;

import java.util.List;

public interface Cashier {
    void checkOut(String uid, List<String> bids);
}
