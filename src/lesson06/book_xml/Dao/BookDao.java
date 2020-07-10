package lesson06.book_xml.Dao;

public interface BookDao {

    Integer selectPrice(String bid);

    void updateStock(String bid);

    void updateBalance(String uid,Integer price);
}
