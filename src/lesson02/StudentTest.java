package lesson02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/conf/beans_StudentTest.xml");
        Student s1 = ac.getBean("s1", Student.class);
        System.out.println(s1);
        Student s2 = ac.getBean("s2", Student.class);
        System.out.println(s2);
        Student s3 = ac.getBean("s3", Student.class);
        System.out.println(s3);
        Student s4 = ac.getBean("s4", Student.class);
        System.out.println(s4);
        Student s5 = ac.getBean("s5", Student.class);
        System.out.println(s5);
        Student s6 = ac.getBean("s6", Student.class);
        System.out.println(s6);
        Student s7 = ac.getBean("s7", Student.class);
        System.out.println(s7);
    }
}
