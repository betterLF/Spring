package lesson05.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf3/aop_xml.xml");
        Calculator calculator = ac.getBean("calculatorImpl", Calculator.class);
        calculator.add(1,1);
    }
}
