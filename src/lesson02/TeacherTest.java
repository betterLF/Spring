package lesson02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf/beans_TeacherTest.xml");
        Teacher t1 = ac.getBean("t1", Teacher.class);
        System.out.println(t1);
        Teacher t2 = ac.getBean("t2", Teacher.class);
        System.out.println(t2);
        Teacher t3 = ac.getBean("t3", Teacher.class);
        System.out.println(t3);
        Teacher t4 = ac.getBean("t4", Teacher.class);
        System.out.println(t4);
    }
}
