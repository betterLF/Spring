package lesson03.annotation.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public UserController(){
        System.out.println("UserController()");
    }
}
