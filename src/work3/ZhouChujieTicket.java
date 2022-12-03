package work3;

public class ZhouChujieTicket
{
    public static void main(String[] args)
    {
        RunnableImpl impl = new RunnableImpl();
        new Thread(impl,"1").start();
        new Thread(impl,"2").start();
        new Thread(impl,"3").start();
        new Thread(impl,"4").start();
        new Thread(impl,"5").start();
        new Thread(impl,"6").start();
        new Thread(impl,"7").start();
        new Thread(impl,"8").start();
        new Thread(impl,"9").start();
        new Thread(impl,"10").start();
    }

}