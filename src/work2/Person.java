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
        if (newPerson.level == "A")
            newPerson.wage = newPerson.wage*1.2;
        newPerson.wage = newPerson.wage*1.1;
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
