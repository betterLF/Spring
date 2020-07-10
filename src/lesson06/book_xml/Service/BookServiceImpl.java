package lesson06.book_xml.Service;

import lesson06.book_xml.Dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(String bid, String uid) {
        Integer price = bookDao.selectPrice(bid);
        bookDao.updateStock(bid);
        bookDao.updateBalance(uid,price);
    }
}
