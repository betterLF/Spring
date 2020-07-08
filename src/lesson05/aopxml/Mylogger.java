package lesson05.aopxml;

import org.springframework.stereotype.Component;

@Component
public class Mylogger {

    public void before(){
        System.out.println("前置通知");
    }
}
