package lesson05.aop;

import lesson05.aop.CalculatorImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect  //标注当前类为切面
@Order(2)
public class MyloggerAspect {
    //重用切入点定义
    @Pointcut(value="execution(* lesson05.aop.*.*(.. ))")
    public void test(){

    }
    //1.前置通知
    /**
     * @Before 将方法指定为前置通知，必须设置value，其值为切入点表达式
     * 前置通知，作用于方法执行之前
     * public int lesson05.aop.CalculatorImpl.*(int,int ) *代表该类下所有方法
     *  * lesson05.aop.CalculatorImpl.*(int,int )) *代表所有的返回值类型
     *  * lesson05.aop.*.*(. . ))  ..代表对该包下所有的类的所有方法
     */
   // @Before(value = "execution(public int lesson05.aop.CalculatorImpl.add(int,int ))")
    @Before(value = "test()")  //使用text方法定义的切入点
   // @Before(value = "execution(public int lesson05.aop.*.*(.. ))")
    public void beforeMethod(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();//获取方法参数
        String name = joinPoint.getSignature().getName();//获取方法名
        System.out.println("method:"+name+",arguments:"+ Arrays.toString(args));
    }

    /**
     *
     * @After 将方法标注为后置通知，作用于方法的finally语句块，即不管有没有异常都会执行
     */
    @After(value = "test()")
//    @After(value = "execution(* lesson05.aop.*.*(.. ))")
    public void afterMethod(){
        System.out.println("后置通知");
    }
    /**
     *
     * @AfterReturning 将方法标注为返回通知，作用于方法执行之后，有异常则不会执行
     * 可通过returning 设置方法返回值的变量名
     * 要想在方法中使用，必须在方法的形参中设置和参数名相同的参数名的参数
     */
    @AfterReturning(value = "test()",returning = "result")
//    @AfterReturning(value = "execution(* lesson05.aop.*.*(.. ))",returning = "result")
        public void afterReturning(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();//获取方法名
        System.out.println("method:"+name+"result:"+result.toString());
        }
    /**
     *
     * @AfterThrowing 将方法标注为异常通知(例外通知),作用于方法抛出异常时
     * 可通过throw设置接收方法返回的异常信息
     * 要想在方法中使用，必须在方法的参数列表中通过具体的异常类型来对指定的异常信息进行操作
     */
    @AfterThrowing(value = "test())",throwing = "ex")
//    @AfterThrowing(value = "execution(* lesson05.aop.*.*(.. ))",throwing = "ex")
        public void afterThrowing(Exception ex){//可以通过定义异常的类型，来进行操作，即处理指定异常
        System.out.println("有异常了,messages"+ex);
    }

    /**
     *
     * @Around 将方法标注为环绕通知,作用于方法整体
     *可以和其他通知一起使用，优先级更高，即它的前置比前置通知优先。。
     */
//    @Around(value = "execution(* lesson05.aop.*.*(.. ))")
//    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
//        Object result=null;
//        try {
//            //前置通知
//            System.out.println("前置通知a");
//            result=proceedingJoinPoint.proceed();//执行方法
//            //返回通知
//            System.out.println("返回通知a");
//            return result;
//        }catch (Throwable e){
//            e.printStackTrace();
//            //异常通知
//            System.out.println("异常通知a");
//        }finally {
//            //后置通知
//            System.out.println("后置通知a");
//        }
//        return -1;
//    }
}
