package work3;

public class ZhouChujieHelloThread
{
    public static void main(String[] args) {
        Object obj = new Object();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t2.start();
        t1.start();
    }
}

class Thread1 extends Thread
{
    private Object obj;

    public Thread1(Object obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        synchronized (obj)
        {
            for (int i = 1; i < 20; i++)
            {
                System.out.print("你好\n");
                obj.notifyAll();
                try
                {
                    obj.wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Thread2 extends Thread
{
    private Object obj;

    public Thread2(Object obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        synchronized (obj)
        {
            for (int i = 0; i <20;i++)
            {
                System.out.print("Hello\n");
                obj.notifyAll();
                try
                {
                    obj.wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
