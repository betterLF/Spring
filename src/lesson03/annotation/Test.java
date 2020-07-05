package lesson03.annotation;

import lesson03.annotation.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf2/user.xml");
       // ac.getBean();
        UserServiceImpl userServiceImpl = ac.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userServiceImpl);
    }
}
