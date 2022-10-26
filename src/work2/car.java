package work2;

public class car
{
    car()
    {
        Name = "ZhouChujie";
        Speed = 0;
    }
    private String Name;
    private int Speed;
    private void out()
    {
        System.out.println("当前车速为："+Speed);
        System.out.println("车主为："+Name);
    }
    public void changeName(String NewName)
    {
        Name = NewName;
        out();
    }
    public void changSpeed(int NewSpeed)
    {
        Speed = NewSpeed;
        out();
    }
    public void stop()
    {
        Speed = 0;
        out();
    }

}
