package lesson03;

public class Person {
    private Integer id;
    private String sex;
    private String name;

    public Person(Integer id, String sex, String name) {
        this.id = id;
        this.sex = sex;
        this.name = name;
    }

    public Person() {
        System.out.println("1:创建对象");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        System.out.println("2:依赖注入");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public void init(){
         System.out.println("3:初始化");
     }
     public void destroy(){
         System.out.println("5:销毁");
     }
    @Override
    public String toString() {
        System.out.println("4:使用");
        return "Person{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
