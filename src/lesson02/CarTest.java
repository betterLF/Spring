package lesson02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf/factory_bean.xml");
        Object factory = ac.getBean("factory");
        System.out.println(factory);
    }
}
