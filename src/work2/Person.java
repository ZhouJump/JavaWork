package work2;

public class Person
{
    Person(String newname,String newaddres)
    {
        name = newname;
        address = newaddres;
    }
    public String name;
    public String address;
    public void addVage(Manager newPerson)
    {
        if (newPerson.level.equals("A"))
            newPerson.wage = newPerson.wage*1.2;
        newPerson.wage = newPerson.wage*1.1;
    }
    public void printinfo(Manager newPerson)
    {
        System.out.println("姓名："+newPerson.name);
        System.out.println("住址："+newPerson.address);
        System.out.println("工号："+newPerson.ID);
        System.out.println("工资："+newPerson.wage);
        System.out.println("工龄："+newPerson.age);
        System.out.println("等级："+newPerson.level);
    }
}

 class Employee extends Person
{
    Employee(String newname, String newaddres,String newID,double newwage,int newage)
    {
        super(newname, newaddres);
        ID = newID;
        wage = newwage;
        age = newage;
    }
    public String ID;
    public double wage;
    public int age;
}


class Manager extends Employee
{
    public String level;

    Manager(String newname, String newaddres,String newID,double newwage,int newage,String newlevel)
    {
        super(newname,newaddres,newID,newwage,newage);
        level = newlevel;
    }
}
