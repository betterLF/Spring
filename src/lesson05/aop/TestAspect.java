package lesson05.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)   //标注优先级，如果没有标准默认谁先创建先调用谁,大于等于0时值越小优先级越高，默认值为int最大值
public class TestAspect {
     @Before(value = "execution(public int lesson05.aop.*.*(.. ))")
    public void beforeMethod(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();//获取方法参数
        String name = joinPoint.getSignature().getName();//获取方法名
        System.out.println("前置通知b");
    }
}
