package lesson06.Book.Dao;

public interface BookDao {

    Integer selectPrice(String bid);

    void updateStock(String bid);

    void updateBalance(String uid,Integer price);
}
