package lesson01;

/**
 * @author lifei
 * @date 2020/7/3 10:19
 */
public class PersonDemoTest {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person);
        person.setId(12);
        person.setName("zz");
        System.out.println(person);
    }
}
