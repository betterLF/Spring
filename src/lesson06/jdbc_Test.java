package lesson06;

import lesson06.JDBC.Ssm;
import lesson06.JDBC.jdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class jdbc_Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf4/jdbc.xml");
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
        //update 实现增删改
//        jdbcTemplate.update("insert into ssm values(null,'张三',23,'男')");
//        String sql="insert into ssm values(null,?,?,?)";
//        jdbcTemplate.update(sql,"李四",24,"男");

//        String sql="delete from ssm where eid in(?)";
//        String eids="1,2,3";//where 的语句不能用通配符赋值(?)，否则只能删除id为1的
//        jdbcTemplate.update(sql,eids);

//        String eids="1,2,3";
//        String sql="delete from ssm where eid in("+eids+")";
//        jdbcTemplate.update(sql);

//      String mohu="a";//模糊查询也不能用通配符查询，除非使用concat('%',?,'%')
//      String sql="select * from ssm where ename like '%?%'";不能
//        String sql="select * from ssm where ename like concat('%',?,'%')";能

        //BatchUpdate 实现批量增删改
//        String sql="insert into ssm values(null,?,?,?)";
//        List<Object[]> list=new ArrayList<>();
//        list.add(new Object[]{"a1",1,"男"});
//        list.add(new Object[]{"a2",2,"男"});
//        list.add(new Object[]{"a3",3,"男"});
//        jdbcTemplate.batchUpdate(sql,list);

        //QueryForObject
        //jdbcTemplate.queryForObject(sql,requiredType);用来获取单个的值
        //jdbcTemplate.queryForObject(sql,rowMapper);用来获取单条数据
//        String sql = "select eid,ename,age,sex from ssm where eid=?";
//        RowMapper<Ssm> rowMapper=new BeanPropertyRowMapper<>(Ssm.class);//将列名(字段名或字段名的别名)与属性名进行映射
//        Ssm ssm = jdbcTemplate.queryForObject(sql, new Object[]{4}, rowMapper);
//        System.out.println(ssm);
//        String sql="select count(*) from ssm";
//        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
//        System.out.println(integer);


        //Query
        String sql="select * from ssm";
        RowMapper<Ssm> rowMapper = new BeanPropertyRowMapper<>(Ssm.class);
        List<Ssm> query = jdbcTemplate.query(sql, rowMapper);
        query.forEach(System.out::println);
    }
}
