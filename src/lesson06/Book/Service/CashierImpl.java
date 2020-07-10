package lesson06.Book.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashierImpl implements Cashier{
    @Autowired
    private BookService bookService;
    @Override
    public void checkOut(String uid, List<String> bids) {
        for (String bid:bids){
            bookService.buyBook(bid,uid);
        }
    }
}
