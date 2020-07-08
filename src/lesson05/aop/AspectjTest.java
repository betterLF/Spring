package lesson05.aop;

import lesson05.aop.Calculator;
import lesson05.aop.CalculatorImpl;
import lesson05.aop.TestHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectjTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf3/aop.xml");
        Calculator calculatorImpl = ac.getBean("calculatorImpl", Calculator.class);
        System.out.println(calculatorImpl.getClass().getName());//com.sun.proxy.$Proxy23  自动生成的代理类名称
        calculatorImpl.add(1,1);
        System.out.println("=======");
//        calculatorImpl.div(1,0);
//        calculatorImpl.div(1,1);
//        System.out.println("=======");
//        TestHandler testHandler = ac.getBean("testHandler", TestHandler.class);
//        testHandler.test();
    }
}
