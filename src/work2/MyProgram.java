package work2;

public class MyProgram
{
    public static void  main(String[] args)
    {
        ZhouChujieProgram zhou = new ZhouChujieProgram();//第一题
        zhou.setData(23333);
        zhou.setStr("乐");
        System.out.println("str是:"+zhou.getStr());
        System.out.println("data是:"+zhou.getData());
        System.out.println(zhou.toStr());

        System.out.println("------==我是优雅分割线==------");

        car 敞篷车 = new car();//第二题
        敞篷车.changeName("肯尼迪");
        敞篷车.changSpeed(60);
        敞篷车.stop();

        System.out.println("------==我是优雅分割线==------");

        Student student = new Student();//第三题
        student.printInfo();
        System.out.println("姓名："+student.getName());
        System.out.println("学号："+student.getId());
        System.out.println("年龄："+student.getAge());
        System.out.println("性别："+student.getGender());
        System.out.println("班级："+student.getClass2());

        System.out.println("------==我是优雅分割线==------");






    }
}
