package lesson03.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autoTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf2/autobean_employee.xml");
        Employee employee = ac.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
