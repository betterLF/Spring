package lesson03.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public UserDaoImpl() {
        System.out.println("UserDaoImpl()");
    }
}
