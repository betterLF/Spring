package lesson06.Book.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer selectPrice(String bid) {
        String sql="select price from book where bid=?";
        Integer price = jdbcTemplate.queryForObject(sql, new Object[]{bid}, Integer.class);
        return price;
    }

    @Override
    public void updateStock(String bid) {
        //获取该书籍的库存
        String sql="select st from stock where sid=?";
        Integer st = jdbcTemplate.queryForObject(sql, new Object[]{bid}, Integer.class);
        if(st<=0) {
            throw new RuntimeException();
        }else{
            String sql2="update stock set st = st-1 where sid=?";
            jdbcTemplate.update(sql2,bid);
        }
    }

    @Override
    public void updateBalance(String uid,Integer price) {
        //查询余额是否足够
          String sql="select balance from money where uid=?";
        Integer balance = jdbcTemplate.queryForObject(sql, new Object[]{uid}, Integer.class);
        if(balance<price) {
            throw new RuntimeException();
        }else{
            String sql2="update money set balance = balance-? where uid=?";
            jdbcTemplate.update(sql2,price,uid);
        }
    }
}
