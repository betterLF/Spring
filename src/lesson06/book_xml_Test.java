package lesson06;

import lesson06.book_xml.Controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class book_xml_Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/conf4/book_xml.xml");
        BookController bookController = ac.getBean("bookController", BookController.class);
//        bookController.buyBook();
        bookController.checkOut();
    }
}
