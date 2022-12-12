package work4;


import java.util.LinkedList;

public class Person
{
    public String name;
    public String id;
        public String toString()
        {
            System.out.println("姓名："+name+" 身份证号："+id);
            return null;
        }

    public static void main(String[] args)
    {
        Person zhangSan = new Person();
        zhangSan.name="张三";
        zhangSan.id="12310000";
        Student liSi = new Student();
        liSi.name = "李四";
        liSi.id = "12320000";
        liSi.chines = 89;
        liSi.math = 93;
        liSi.english = 94;
        Teacher yingMing = new Teacher();
        yingMing.name = "英明";
        yingMing.id = "12330000";
        yingMing.course = 4000;
        LinkedList<Person> list=new LinkedList<Person>();
        list.add(zhangSan);
        list.add(liSi);
        list.add(yingMing);
        list.toString();
    }
}
class Student extends Person
{
    int chines = 0;
    int english = 0;
    int math = 0;
    public String toString()
    {
        System.out.println("姓名："+name+" 身份证号："+id+" 语文："+chines+" 数学："+math+" 英语："+english);
        return null;
    }
}
class Teacher extends Person
{
    int course = 0;
    public String toString()
    {
        System.out.println("姓名："+name+" 身份证号："+id+" 工资："+course);
        return null;
    }
}