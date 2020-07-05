package lesson03;

import lesson02.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest02 {
    public static void main(String[] args) {
        /**
         * Spring IOC容器对bean的生命周期进行管理的过程:
         * 1:通过构造器或工厂方法创建bean实例
         * 2:为bean的属性设置值和对其他bean的引用
         * 3:调用bean的初始化方法
         * 4:bean可以使用了
         * 5:当容器关闭，调用bean的销毁方法
         */
        /**
         * bean的后置处理器
         * 1:bean后置处理器允许在调用初始化方法后对bean进行额外的处理
         * 2:bean后置处理器对IOC容器里的所有bean实例逐一处理，而非单一实例
         * 3:bean后置处理器需要实现接口BeanPostProcessor
         * 以及postProcessBeforeInitialization()和postProcessAfterInitialization()方法
         * 此时在原本第4步前添加before方法,第4步后添加after方法
         */
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("/conf2/bean_person.xml");
        Person p1 = ac.getBean("p1", Person.class);
        System.out.println(p1);
        ac.close();

    }
}
