package lesson04;

import lesson04.proxy.Calculator;
import lesson04.proxy.CalculatorImpl;
import lesson04.proxy.ProxyUtil;

public class CalculatorTest {
    public static void main(String[] args) throws Exception {
        ProxyUtil proxyUtil=new ProxyUtil( new CalculatorImpl());
         Calculator proxy = (Calculator) proxyUtil.getProxy();
         int i=proxy.div(1,0);
        System.out.println(i);

    }
}
