package lesson04.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil  {

    private CalculatorImpl calculatorImpl;

    public ProxyUtil(CalculatorImpl calculatorImpl) {
        this.calculatorImpl = calculatorImpl;
    }

    public Object getProxy(){
        //获取当前类的类加载器用来加载代理对象所属类
        ClassLoader classLoader = this.getClass().getClassLoader();
        //获取目标对象实现的所有接口的Class,代理类会和目标类实现相同的接口，最终通过代理对象实现功能
        Class[] interfaces = calculatorImpl.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            //代理对象实现功能的方式
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                try {
                    MyLogger.before(method.getName(), Arrays.toString(objects));
                    Object result = method.invoke(calculatorImpl, objects);//动态代理对象实现功能calculator执行方法的类，objects方法的形参
                    MyLogger.after(method.getName(), result);
                    return result;
                } catch (Exception e) {
                    MyLogger.throwing();
                    e.printStackTrace();
                }
                return null;
            }
});
    }
}
