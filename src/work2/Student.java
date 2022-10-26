package work2;

public class Student
{
    Student()
    {
        Name = "周楚杰";
        Id = "202112900902";
        Age = 19;
        Class = 2112;
        Gender = "男";
    }
    public void printInfo()
    {
        System.out.println("姓名："+Name);
        System.out.println("学号："+Id);
        System.out.println("年龄："+Age);
        System.out.println("性别："+Gender);
        System.out.println("班级："+Class);
    }
    public String getName()
    {
        return Name;
    }
    public String getId()
    {
        return Id;
    }
    public String getGender()
    {
        return Gender;
    }
    public int getAge()
    {
        return Age;
    }
    public int getClass2()
    {
        return Class;
    }
    private String Id;
    private String Name;
    private int Age;
    private int Class;
    private String Gender;

}
