package lesson03;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class databaseTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf2/dataSource.xml");
        DruidDataSource datasource = ac.getBean("datasource", DruidDataSource.class);
        System.out.println(datasource.getConnection());
    }
}
