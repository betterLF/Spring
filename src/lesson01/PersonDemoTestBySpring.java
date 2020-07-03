package lesson01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

public class PersonDemoTestBySpring {
    public static void main(String[] args) {
        //初始化容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf/personTest.xml");

        //获取对象
        //Person person =(Person)ac.getBean("personOne");
        //Person person02 =(Person)ac.getBean("personTwo");
        //System.out.println(person.toString());
        //System.out.println(person02.toString());
        //使用此方法获取对象时，要求spring所管理的此类型的对象只能有一个
       //Person person1 = ac.getBean(Person.class);//如果xml文件中有多个person，所以此时调用该方法会报错
        //System.out.println(person1.toString());
        Person personTwo = ac.getBean("personTwo", Person.class);
        System.out.println(personTwo);

    }
}
