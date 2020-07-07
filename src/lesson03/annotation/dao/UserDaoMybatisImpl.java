package lesson03.annotation.dao;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMybatisImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("UserDaoMybatisImpl添加成功");
    }
}
