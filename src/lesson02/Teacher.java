package lesson02;

import java.util.List;
import java.util.Map;

public class Teacher {
    private Integer tid;
    private String tname;
    private List<String> classroom;
    private List<Student> students;//不能叫sList，因此此时set方法为setsList
    private Map<String,String> bossMap;//key为编号，value为名字
    public Teacher() {
    }

    public Teacher(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<String> getClassroom() {
        return classroom;
    }

    public void setClassroom(List<String> classroom) {
        this.classroom = classroom;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<String, String> getBossMap() {
        return bossMap;
    }

    public void setBossMap(Map<String, String> bossMap) {
        this.bossMap = bossMap;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", classroom=" + classroom +
                ", students=" + students +
                ", bossMap=" + bossMap +
                '}';
    }
}
