package lesson03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest02 {
    public static void main(String[] args) {
        //单列模式会在容器初始化时创建好构造方法，而多例不同
        /**
         * 若spring中有单列模式的bean，在初始化容器时就会创建此对象，而多例会在使用时创建
         * 单列时调用同一个bean，构造方法创建一次，而多例创建两次
         * 单列调用同一个bean时地址一样，多例地址不一样
         */

        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf2/bean_student.xml");
        Student s1 = ac.getBean("s1", Student.class);
        Student s2 = ac.getBean("s1", Student.class);
        System.out.println(s1);
        System.out.println(s2);
    }
}
